<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=0">

    <script>
        // Ignore this in your implementation
        window.isMbscDemo = true;
    </script>

    <title>Add/delete event</title>

    <!-- Mobiscroll JS and CSS Includes -->
    <link rel="stylesheet" href="css/mobiscroll.javascript.min.css">
    <script src="js/mobiscroll.javascript.min.js"></script>

    <style type="text/css">
    body {
        margin: 0;
        padding: 0;
    }

    body,
    html {
        height: 100%;
    }

    .md-add-event-demo {
        position: absolute;
        height: 100%;
    }
    
    .md-add-event-demo .mbsc-row {
        height: 100%;
    }
    
    .md-add-event-demo .md-col-right {
        overflow: auto;
        height: 100%;
        border-left: 1px solid #ccc;
    }
    
    .md-add-event-demo .md-delete-btn {
        margin: 0;
        position: absolute;
        right: 10px;
        top: 8px;
        z-index: 1;
        transition: background-color .3s ease-out;
    }
    
    .mbsc-material .md-add-event-demo .md-delete-btn {
        top: 6px;
    }
    
    .mbsc-windows .md-add-event-demo .md-delete-btn {
        top: 10px;
    }
    
    .md-add-event-demo .md-delete-btn.mbsc-btn-outline.mbsc-btn:not(:disabled):not(.mbsc-active):hover:hover {
        background: #f5504e;
        color: #fff;
    }
    
    .mbsc-rtl .md-add-event-demo .md-delete-btn {
        right: auto;
        left: 10px;
    }
    
    .md-add-event-popup {
        max-width: 400px;
    }
    </style>

</head>
<body>

<div mbsc-page class="demo-add-delete-event">
  <div style="height:100%">
      <div mbsc-form>
        <div class="mbsc-grid md-add-event-demo">
            <div class="mbsc-row mbsc-no-padding">
                <div class="mbsc-col-md-4 mbsc-col-12">
                    <div id="demo-add-event-month"></div>
                    <div class="mbsc-btn-group-block">
                        <button mbsc-button id="showAddEventPopup">Add New Event</button>
                    </div>
                </div>
                <div class="mbsc-col-md-8 mbsc-col-12 md-col-right">
                    <div id="demo-add-event-day"></div>
                </div>
            </div>
        </div>
    </div>
    
    <div id="demo-add-event-popup" class="md-add-event-popup">
        <div mbsc-form>
            <div class="mbsc-form-group">
                <label>
                    Title
                    <input mbsc-input id="eventText">
                </label>
                <label>
                    Description
                    <textarea mbsc-textarea id="eventDesc"></textarea>
                </label>
            </div>
            <div class="mbsc-form-group">
                <label for="allDay">
                    All-day
                    <input mbsc-switch id="allDay" type="checkbox">
                </label>
                <label for="eventDate">
                    Starts
                    <input mbsc-input id="eventDate">
                </label>
                <label>
                    Ends
                    <input mbsc-input id="endInput">
                </label>
                <label>
                    Show as busy
                    <input mbsc-segmented type="radio" name="free" value="false" checked>
                </label>
                <label>
                    Show as free
                    <input mbsc-segmented type="radio" name="free" value="true">
                </label>
            </div>
        </div>
    </div>
  </div>
</div>

<script>

    mobiscroll.settings = {
        lang: 'en',                              // Specify language like: lang: 'pl' or omit setting to use default
        theme: 'ios',                            // Specify theme like: theme: 'ios' or omit setting to use default
        themeVariant: 'light'                    // More info about themeVariant: https://docs.mobiscroll.com/4-10-7/javascript/eventcalendar#opt-themeVariant
    };
    
    var monthInst,
        dayInst,
        popupInst,
        dateInst,
        preventSet,
        allDaySwitch = document.getElementById('allDay'),
        eventTextInput = document.getElementById('eventText'),
        eventDescInput = document.getElementById('eventDesc'),
        now = new Date(),
        btn = '<button class="mbsc-btn mbsc-btn-outline mbsc-btn-danger md-delete-btn mbsc-ios">Delete</button>',
        myData = [{
            start: new Date(now.getFullYear(), now.getMonth(), 8, 13),
            end: new Date(now.getFullYear(), now.getMonth(), 8, 13, 30),
            text: 'Lunch @ Butcher\'s' + btn,
            color: '#26c57d'
        }, {
            start: new Date(now.getFullYear(), now.getMonth(), now.getDate(), 15),
            end: new Date(now.getFullYear(), now.getMonth(), now.getDate(), 16),
            text: 'General orientation' + btn,
            color: '#fd966a'
        }, {
            start: new Date(now.getFullYear(), now.getMonth(), now.getDate() - 1, 18),
            end: new Date(now.getFullYear(), now.getMonth(), now.getDate() - 1, 22),
            text: 'Dexter BD' + btn,
            color: '#37bbe4'
        }, {
            start: new Date(now.getFullYear(), now.getMonth(), now.getDate() + 1, 10, 30),
            end: new Date(now.getFullYear(), now.getMonth(), now.getDate() + 1, 11, 30),
            text: 'Stakeholder mtg.' + btn,
            color: '#d00f0f'
        }];
    
    function navigate(inst, val) {
        if (inst) {
            inst.navigate(val);
        }
    }
    
    dateInst = mobiscroll.range('#eventDate', {
        controls: ['date', 'time'],
        dateWheels: '|D M d|',
        endInput: '#endInput',
        tabs: false,
        responsive: {                            // More info about responsive: https://docs.mobiscroll.com/4-10-7/javascript/eventcalendar#opt-responsive
            large: {
                touchUi: false
            }
        },
        cssClass: 'md-add-event-range'
    });
    
    dayInst = mobiscroll.eventcalendar('#demo-add-event-day', {
        display: 'inline',                       // Specify display mode like: display: 'bottom' or omit setting to use default
        view: {                                  // More info about view: https://docs.mobiscroll.com/4-10-7/javascript/eventcalendar#opt-view
            eventList: { type: 'day' }
        },
        data: myData,                            // More info about data: https://docs.mobiscroll.com/4-10-7/javascript/eventcalendar#opt-data
        onPageChange: function (event, inst) {   // More info about onPageChange: https://docs.mobiscroll.com/4-10-7/javascript/eventcalendar#event-onPageChange
            var day = event.firstDay;
            preventSet = true;
            navigate(monthInst, day);
            dateInst.setVal([day, new Date(day.getFullYear(), day.getMonth(), day.getDate(), day.getHours() + 2)], true);
        },
        onEventSelect: function (event, inst) {  // More info about onEventSelect: https://docs.mobiscroll.com/4-10-7/javascript/eventcalendar#event-onEventSelect
            if (event.domEvent.target.classList.contains('md-delete-btn')) {
                mobiscroll.confirm({ 
                    
                    title: 'Confirm Deletion',
                    message: 'Are you sure you want to delete this item?',
                    okText: 'Delete',
                    callback: function (res) {
                        if (res) {
                            inst.removeEvent([event.event._id]);
                            monthInst.removeEvent([event.event._id]);
                            mobiscroll.toast({ 
                                
                                message: 'Deleted'
                            });
                        }
                    }
                });
            }
        }
    });
    
    monthInst = mobiscroll.eventcalendar('#demo-add-event-month', {
        display: 'inline',                       // Specify display mode like: display: 'bottom' or omit setting to use default
        view: {                                  // More info about view: https://docs.mobiscroll.com/4-10-7/javascript/eventcalendar#opt-view
            calendar: { type: 'month' }
        },
        data: myData,                            // More info about data: https://docs.mobiscroll.com/4-10-7/javascript/eventcalendar#opt-data
        onSetDate: function (event, inst) {      // More info about onSetDate: https://docs.mobiscroll.com/4-10-7/javascript/eventcalendar#event-onSetDate
            if (!preventSet) {
                var day = event.date;
                navigate(dayInst, day);
                dateInst.setVal([day, new Date(day.getFullYear(), day.getMonth(), day.getDate(), day.getHours() + 2)], true);
            }
            preventSet = false;
        }
    });
    
    document
        .getElementById('allDay')
        .addEventListener('change', function () {
            var allDay = this.checked;
    
            dateInst.option({
                controls: allDay ? ['date'] : ['date', 'time'],
                dateWheels: (allDay ? 'MM dd yy' : '|D M d|')
            });
        });
    
    popupInst = mobiscroll.popup('#demo-add-event-popup', {
        display: 'center',                       // Specify display mode like: display: 'bottom' or omit setting to use default
        cssClass: 'mbsc-no-padding',
        buttons: [{                              // More info about buttons: https://docs.mobiscroll.com/4-10-7/javascript/eventcalendar#opt-buttons
                text: 'Add event',
                handler: 'set'
            },
            'cancel'
        ],
        headerText: 'Add new event',             // More info about headerText: https://docs.mobiscroll.com/4-10-7/javascript/eventcalendar#opt-headerText
        onSet: function (event, inst) {
            var eventDates = dateInst.getVal(),
                events = {
                    start: eventDates[0],
                    end: eventDates[1],
                    text: (eventTextInput.value || 'New Event') + btn,
                    title: eventTextInput.value || 'New Event',
                    description: eventDescInput.value,
                    allDay: allDaySwitch.checked,
                    free: document.querySelector('input[name="free"]:checked').value == 'true'
                };
            monthInst.addEvent(events);
            dayInst.addEvent(events);
            eventTextInput.value = '';
            eventDescInput.value = '';
            // Navigate the calendar to the new event's start date
            monthInst.navigate(eventDates[0], true);
        }
    });
    
    document
        .getElementById('showAddEventPopup')
        .addEventListener('click', function () {
            popupInst.show();
        }, false);
</script>

</body>
</html>
