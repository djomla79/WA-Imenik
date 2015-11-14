$("document").ready(function() {
	
	$("#jq").validate({
		rules: {
			ime: {
				required: true,
				lettersonly: true,
				minlength: 3,
				maxlength: 20
			},
			prezime: {
				required: true,
				lettersonly: true,
				minlength: 4,
				maxlength: 20
			},
			telefon: {
				required: true,
				digits: true,
				minlength: 6, 
				maxlength: 12
			},
			adresa: {
				required: true,
				minlength: 5,
				maxlength: 20
			},
			email: {
				required: true,
				email: true
			},
			rodjenje: {
				required: true
			},
			pol: {
				required: true,
				minlength: 5,
				maxlength: 6
			},
			username: {
				required: true,
				minlength: 5,
				maxlength: 15
			},
			password: {
				required: true,
				minlength: 8,
				maxlength: 15
			}
		},
		messages: {
			ime: {
				lettersonly: "Unesite samo slova!"
			},
			prezime: {
				lettersonly: "Unesite samo slova!"
			},
			telefon: {
				digits: "Unesite samo brojeve!"
			},
			pol: {
				lettersonly: "Unesite pol, musko - zensko!"
			}
		}
	});
});