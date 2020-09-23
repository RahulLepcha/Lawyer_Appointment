$(function() {
			
			//Solving Active menu issue
			switch (menu) {
			case 'Home':
				$('#home').addClass('active');
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
		});