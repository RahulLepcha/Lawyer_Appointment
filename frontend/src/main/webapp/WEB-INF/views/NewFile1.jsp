
    <link rel="stylesheet" href="${css}/mobiscroll.javascript.min.css">
    <script src="${js}/mobiscroll.javascript.min.js"></script>


<script>
    mobiscroll.settings = {
        theme: 'ios',
        themeVariant: 'light',
        lang: 'en'
    };

    var inst = mobiscroll.eventcalendar('#demo-responsive-month-view', {
        lang: 'en',                // Specify language like: lang: 'pl' or omit setting to use default
        theme: 'ios',              // Specify theme like: theme: 'ios' or omit setting to use default
        themeVariant: 'light',     // More info about themeVariant: https://docs.mobiscroll.com/4-10-7/javascript/eventcalendar#opt-themeVariant
        display: 'inline',         // Specify display mode like: display: 'bottom' or omit setting to use default
        calendarHeight: 513,       // More info about calendarHeight: https://docs.mobiscroll.com/4-10-7/javascript/eventcalendar#opt-calendarHeight
        view: {                    // More info about view: https://docs.mobiscroll.com/4-10-7/javascript/eventcalendar#opt-view
                calendar: {
                    labels: true,  // More info about labels: https://docs.mobiscroll.com/4-10-7/javascript/eventcalendar#opt-labels
                    popover: true
                }
            }
    });
    
    mobiscroll.util.getJson('https://trial.mobiscroll.com/events/', function (events) {
        inst.setEvents(events);
    }, 'jsonp');
</script>

</script>
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

<div mbsc-page class="demo-responsive-month-view">
  <div style="height:100%">
      <div id="demo-responsive-month-view"></div>
  </div>
</div>
