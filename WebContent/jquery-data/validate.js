$(function() {
	
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
				lettersonly: true,
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
				required: "Unesite vase ime!",
				lettersonly: "Unesite samo slova!",
				minlength: "Unesite minimalno 3 karaktera!",
				maxlength: "Unesite maximalno 20 karaktera!"
			},
			prezime: {
				required: "Unesite vase ime!",
				lettersonly: "Unesite samo slova!",
				minlength: "Unesite minimalno 4 karaktera!",
				maxlength: "Unesite maximalno 20 karaktera!"
			},
			telefon: {
				digits: "Unesite samo brojeve!",
				required: "Unesite vas broj telefona!",
				minlength: "Unesite minimalno 6 karaktera!",
				maxlength: "Unesite maximalno 12 karaktera!"
			},
			adresa: {
				required: "Unesite vasu adresu!",
				minlength: "Unesite minimalno 5 karaktera!",
				maxlength: "Unesite maximalno 20 karaktera!"
			},
			email: {
				required: "Unesite vasu email adresu!",
				email: "Unesite ispravno email adresu!"
			},
			pol: {
				required: "Unesite vas pol!",
				lettersonly: "Unesite samo slova!",
				minlength: "Unesite minimalno 5 karaktera!",
				maxlength: "Unesite maximalno 6 karaktera!"
			},
			username: {
				required: "Unesite vase korisnicko ime!",
				minlength: "Unesite minimalno 5 karaktera!",
				maxlength: "Unesite maximalno 15 karaktera!"
			},
			password: {
				required: "Unesite vasu lozinku!",
				minlength: "Unesite minimalno 8 karaktera!",
				maxlength: "Unesite maximalno 15 karaktera!"
			}
		}
	});
});