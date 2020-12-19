$(function() {

	//Solving Active menu issue
	switch (menu) {
		case 'Home':
			$('#home').addClass('active');
			break;
		case 'client_I':
			$('#client_I').addClass('active');
			break;
	
		case 'Sign Up':
			$('#signUp').addClass('active');
			break;
		case 'About Us':
			$('#aboutUs').addClass('active');
			break;
		case 'forgotPassword':
			$('#forgotPasword').addClass('active');
			break;
		case 'client_Index':
			$('#client_Index').addClass('active');
			break;
		case 'client_Add':
			$('#client_Index').addClass('active');
			break;
		case 'Case_Index':
			$('#Case_Index').addClass('active');
			break;
		case 'Case_Add':
			$('#Case_Index').addClass('active');
			break;
		default:
			$('#home').addClass('active');
			break;

	}
	

var $tabledata=$('#courtcases');
	if($tabledata.length)
	{
		var jsonUrl = '';
				jsonUrl = window.contextRoot + '/json/data/Case_Index/all';
						
		$tabledata.DataTable({
		ajax:{
			url:jsonUrl,
			dataSrc:''
		},
		columns:[
			{data:'caseuID'},
			{data:'caseId'},
			{data:'crtid'},
			{data:'oppositionPartyName'},
			{data:'caseBrief'},
			{data:'caseIdate'},
			{data:'casePriority'},
			{
				data:'caseId',
				bSortable:false,
				mRender: function(data,type,row)
				{
					var str='';
					str += '<a href="'+window.contextRoot+'/Update/'+data+'/Case_I" ><i class="material-icons">mode_edit</i></a> &#160';
					str += '<a href="'+window.contextRoot+'/Delete/'+data+'/Case_index" ><i class="material-icons">delete_forever</i></a>&#160';
					str += '<a href="'+window.contextRoot+'/json/data/CaseHearing_Index/'+data+'/" ><i class="material-icons">format_list_bulleted</i></a>&#160';
					
					return str;
				}
			}
		]			
});
}


var $tabledata=$('#courtHearing');
	if($tabledata.length)
	{
						
		$tabledata.DataTable({
		ajax:{
			url:jsonUrl,
			dataSrc:''
		},
		columns:[
			{data:'caseuID'},
			{data:'caseId'},
			{data:'crtid'},
			{data:'oppositionPartyName'},
			{data:'caseBrief'},
			{data:'caseIdate'},
			{data:'casePriority'},
			{
				data:'caseId',
				bSortable:false,
				mRender: function(data,type,row)
				{
					var str='';
					str += '<a href="'+window.contextRoot+'/Update/'+data+'/Case_I" ><i class="material-icons">mode_edit</i></a> &#160';
					str += '<a href="'+window.contextRoot+'/Delete/'+data+'/Case_index" ><i class="material-icons">delete_forever</i></a>&#160';
					str += '<a href="'+window.contextRoot+'/Show/'+data+'/" ><i class="material-icons">format_list_bulleted</i></a>&#160';
					
					return str;
				}
			}
		]			
});
}

	var $tabledata=$('#clientNames');
	if($tabledata.length)
	{
		var jsonUrl = '';
		jsonUrl = window.contextRoot + '/json/data/client_Index/all';
		
		$tabledata.DataTable({
		ajax:{
			url:jsonUrl,
			dataSrc:''
		},
		columns:[
			{data:'cid'},
			{data:'cname'},
			{data:'cmoblie'},
			{data:'cemail'},
			{data:'caddress'},
			{
				data:'cid',
				bSortable:false,
				mRender: function(data,type,row)
				{
					var str='';
					str += '<a href="'+window.contextRoot+'/Update/'+data+'/client_2" ><i class="material-icons">mode_edit</i></a> &#160';
					str += '<a href="'+window.contextRoot+'/Delete/'+data+'/client_index" ><i class="material-icons">delete_forever</i></a>';
					return str;
				}
			}
		]			
});


	}
});
$(function () {

    // INITIALIZE DATEPICKER PLUGIN
    $('.datepicker').datepicker({
        clearBtn: true,
        format: "dd/mm/yyyy"
    });
    $alert=$('.alert');
    
    if($alert.length){
        setTimeout(function(){
           $alert.fadeout('slow');
           },3000)
     }
           

    // FOR DEMO PURPOSE
    $('#reservationDate').on('change', function () {
        var pickedDate = $('input').val();
        $('#pickedDate').html(pickedDate);
    });
});

$('#calendar').fullCalendar({
    header: {
        left: 'prev,next today',
        center: 'title',
        right: 'month,agendaWeek,agendaDay,listWeek'
    },
    defaultDate: '2018-11-16',
    navLinks: true,
    eventLimit: true,
    events: [{
            title: 'Front-End Conference',
            start: '2018-11-16',
            end: '2018-11-18'
        },
        {
            title: 'Hair stylist with Mike',
            start: '2018-11-20',
            allDay: true
        },
        {
            title: 'Car mechanic',
            start: '2018-11-14T09:00:00',
            end: '2018-11-14T11:00:00'
        },
        {
            title: 'Dinner with Mike',
            start: '2018-11-21T19:00:00',
            end: '2018-11-21T22:00:00'
        },
        {
            title: 'Chillout',
            start: '2018-11-15',
            allDay: true
        },
        {
            title: 'Vacation',
            start: '2018-11-23',
            end: '2018-11-29'
        },
    ]
});

//Logic for displaying all the client names

//creating dummy data set




