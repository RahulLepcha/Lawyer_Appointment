<script src="${js}/mobiscroll.javascript.min.js"></script>
<link href="${css}/mobiscroll.javascript.min.css" rel="stylesheet">


<script type="text/javascript">
//Load the Google API Client
window.onGoogleLoad = function () {
    window.gapi.load('client', initClient);

mobiscroll.settings = {
        lang: 'en',                        // Specify language like: lang: 'pl' or omit setting to use default
        theme: 'ios',                      // Specify theme like: theme: 'ios' or omit setting to use default
        themeVariant: 'auto'              // More info about themeVariant: https://docs.mobiscroll.com/4-10-7/javascript/eventcalendar#opt-themeVariant
    };
    
    
    // Load the SDK asynchronously
    function loadGoogleSDK() {
        (function (d, s, id) {
            var js, fjs = d.getElementsByTagName(s)[0];
            if (d.getElementById(id)) {
                onGoogleLoad();
                return;
            }
            js = d.createElement(s);
            js.id = id;
            js.src = "https://apis.google.com/js/api.js?onload=onGoogleLoad";
            js.onload = "onGoogleLoad";
            fjs.parentNode.insertBefore(js, fjs);
        }(document, 'script', 'google-jssdk'));
    };
    
    // Init the Google API client
    function initClient() {
        window.gapi.client.init({
            apiKey: API_KEY,
            clientId: CLIENT_ID,
            discoveryDocs: DISCOVERY_DOCS,
            scope: SCOPES
        }).then(function () {
            calApiLoaded = true;
            loadEvents(firstDay, lastDay);
        });
    }
    
    // Load events from Google Calendar between 2 dates
    function loadEvents(firstDay, lastDay) {
        // Only load events if the Google API finished loading
        if (calApiLoaded) {
            window.gapi.client.calendar.events.list({
                'calendarId': CALENDAR_ID,
                'timeMin': firstDay.toISOString(),
                'timeMax': lastDay.toISOString(),
                'showDeleted': false,
                'singleEvents': true,
                'maxResults': 100,
                'orderBy': 'startTime'
            }).then(function (response) {
                var event;
                var events = response.result.items;
                var eventList = [];
                // Process event list
                for (var i = 0; i < events.length; ++i) {
                    event = events[i];
                    eventList.push({
                        start: new Date(event.start.date || event.start.dateTime),
                        end: new Date(event.end.date || event.end.dateTime),
                        text: event.summary || 'No Title'
                    });
                }
                // Pass the processed events to the calendar
                calInst.setEvents(eventList);
            });
        }
    }
    
    var API_KEY = '<YOUR_API_KEY>';
    var CLIENT_ID = '<YOUR_CLIENT_ID>';
    
    var CALENDAR_ID = 'theacidmedia.net_8l6v679q5j2f7q8lpmcjr4mm3k@group.calendar.google.com';
    var DISCOVERY_DOCS = ["https://www.googleapis.com/discovery/v1/apis/calendar/v3/rest"];
    var SCOPES = "https://www.googleapis.com/auth/calendar.readonly";
    
    var calApiLoaded;
    var firstDay;
    var lastDay;
    
    var calInst = mobiscroll.eventcalendar('#demo-google-cal', {
        display: 'inline',                 // Specify display mode like: display: 'bottom' or omit setting to use default
        view: {                            // More info about view: https://docs.mobiscroll.com/4-10-7/javascript/eventcalendar#opt-view
            calendar: {
                labels: true               // More info about labels: https://docs.mobiscroll.com/4-10-7/javascript/eventcalendar#opt-labels
            }
        },
        data: [],                          // More info about data: https://docs.mobiscroll.com/4-10-7/javascript/eventcalendar#opt-data
        onPageLoading: function (event) {  // More info about onPageLoading: https://docs.mobiscroll.com/4-10-7/javascript/eventcalendar#event-onPageLoading
            var year = event.firstDay.getFullYear(),
                month = event.firstDay.getMonth();
    
            // Calculate dates 
            // (pre-load events for previous and next months as well)
            firstDay = new Date(year, month - 1, -7);
            lastDay = new Date(year, month + 2, 14);
    
            loadEvents(firstDay, lastDay);
        }
    });
    
    // Load the Google SDK
    loadGoogleSDK();
</script>


  <div style="height:100%">
      <div id="demo-google-cal"></div>
  </div>
