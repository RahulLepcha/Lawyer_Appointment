<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=0">

    <script>
        // Ignore this in your implementation
        window.isMbscDemo = true;
    </script>

    <title>Events from Google calendar</title>

    <script src="https://code.jquery.com/jquery-1.11.2.min.js"></script>

    <!-- Mobiscroll JS and CSS Includes -->
    <link rel="stylesheet" href="css/mobiscroll.jquery.min.css">
    <script src="js/mobiscroll.jquery.min.js"></script>

    <style type="text/css">
    body {
        margin: 0;
        padding: 0;
    }

    body,
    html {
        height: 100%;
    }

    </style>

</head>
<body>

<div mbsc-page class="demo-load-events-from-google-calendar">
  <div style="height:100%">
      
        <div id="demo-google-cal"></div>
        
  </div>
</div>

<script>

    mobiscroll.settings = {
        lang: 'en',                            // Specify language like: lang: 'pl' or omit setting to use default
        theme: 'ios',                          // Specify theme like: theme: 'ios' or omit setting to use default
            themeVariant: 'light'              // More info about themeVariant: https://docs.mobiscroll.com/4-10-7/eventcalendar#opt-themeVariant
    };
    
    $(function () {
    
        // Load the Google API Client
        window.onGoogleLoad = function () {
            window.gapi.load('client', initClient);
        }
    
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
    
        var calInst = $('#demo-google-cal').mobiscroll().eventcalendar({
            display: 'inline',                 // Specify display mode like: display: 'bottom' or omit setting to use default
            view: {                            // More info about view: https://docs.mobiscroll.com/4-10-7/eventcalendar#opt-view
                calendar: {
                    labels: true               // More info about labels: https://docs.mobiscroll.com/4-10-7/eventcalendar#opt-labels
                }
            },
            data: [],                          // More info about data: https://docs.mobiscroll.com/4-10-7/eventcalendar#opt-data
            onPageLoading: function (event) {  // More info about onPageLoading: https://docs.mobiscroll.com/4-10-7/eventcalendar#event-onPageLoading
                var year = event.firstDay.getFullYear(),
                    month = event.firstDay.getMonth();
    
                // Calculate dates 
                // (pre-load events for previous and next months as well)
                firstDay = new Date(year, month - 1, -7);
                lastDay = new Date(year, month + 2, 14);
    
                loadEvents(firstDay, lastDay);
            }
        }).mobiscroll('getInst');
    
        // Load the Google SDK
        loadGoogleSDK();
    
    });
</script>

</body>
</html>
