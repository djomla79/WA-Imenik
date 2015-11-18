$('document').ready(function() {
	
	$("#signup").validate({
		rules: {
			ime: {
				required: true,
				lettersonly: true,
				rangelength:[3,16]
			},
			prezime: {
				required: true,
				lettersonly: true,
				rangelength:[4,16]
			},
			telefon: {
				required: true,
				digits: true,
				rangelength:[9,16]
			},
			adresa: {
				required: true,
				rangelength:[5,16]
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
				rangelength:[5,6]
			},
			username: {
				required: true,
				rangelength:[4,16]
			},
			password: {
				required: true,
				rangelength:[8,16]
			}
		},
		errorPlacement: function(error, element) { 
		       if ( element.is(":radio") || element.is(":checkbox")) {
		          error.appendTo( element.parent()); 
		        } else {
		          error.insertAfter(element);
		        } 
		    },
		messages: {
			ime: {
				required: "Unesite vase ime.",
				lettersonly: "Unesite samo slova.",
				rangelength: "Unesite izmedju 3 i 16 karaktera."
			},
			prezime: {
				required: "Unesite vase ime.",
				lettersonly: "Unesite samo slova.",
				rangelength: "Unesite izmedju 4 i 16 karaktera."
			},
			telefon: {
				digits: "Unesite samo brojeve.",
				required: "Unesite vas broj telefona.",
				rangelength: "Unesite izmedju 9 i 16 karaktera."
			},
			adresa: {
				required: "Unesite vasu adresu.",
				rangelength: "Unesite izmedju 5 i 16 karaktera."
			},
			email: {
				required: "Unesite vasu email adresu.",
				email: "Unesite validnu email adresu."
			},
			rodjenje: {
				required: "Unesite vas datum rodjenja."
			},
			pol: {
				required: "Unesite vas pol.",
				lettersonly: "Unesite samo slova.",
				rangelength: "Unesite izmedju 5 i 6 karaktera."
			},
			username: {
				required: "Unesite vase korisnicko ime.",
				rangelength: "Unesite izmedju 4 i 16 karaktera."
			},
			password: {
				required: "Unesite vasu lozinku.",
				rangelength: "Unesite izmedju 8 i 16 karaktera."
			}
		}
	});
	$("#delete").validate({
		rules: {
			username: {
				required: true,
				rangelength:[3,16]
			}
		},
		errorPlacement: function(error, element) { 
		       if ( element.is(":radio") || element.is(":checkbox")) {
		          error.appendTo( element.parent()); 
		        } else {
		          error.insertAfter(element);
		        } 
		    },
		messages: {
			username: {
				required: "Unesite vase korisnicko ime.",
				rangelength: "Unesite izmedju 3 i 16 karaktera."
			}
		}
		});
	$("#login").validate({
		rules: {
			username: {
				required: true,
				rangelength:[4,16]
			},
			password: {
				required: true,
				rangelength:[2,16]
			}
		},
		errorPlacement: function(error, element) { 
		       if ( element.is(":radio") || element.is(":checkbox")) {
		          error.appendTo( element.parent()); 
		        } else {
		          error.insertAfter(element);
		        } 
		    },
		messages: {
			username: {
				required: "Unesite vase korisnicko ime.",
				rangelength: "Unesite izmedju 4 i 16 karaktera."
			},
			password: {
				required: "Unesite vasu lozinku.",
				rangelength: "Unesite izmedju 2 i 16 karaktera."
			}
		}
		});
	$("#search").validate({
		rules: {
			search: {
				required: true,
				rangelength:[4,16]
			}
		},
		errorPlacement: function(error, element) { 
		       if ( element.is(":radio") || element.is(":checkbox")) {
		          error.appendTo( element.parent()); 
		        } else {
		          error.insertAfter(element);
		        } 
		    },
		messages: {
			search: {
				required: "Unesite podatke za pretragu.",
				rangelength: "Unesite izmedju 4 i 16 karaktera."
			}
		}
		});
	$("#update").validate({
		rules: {
			username: {
				required: true,
				rangelength:[4,16]
			}
		},
		errorPlacement: function(error, element) { 
		       if ( element.is(":radio") || element.is(":checkbox")) {
		          error.appendTo( element.parent()); 
		        } else {
		          error.insertAfter(element);
		        } 
		    },
		messages: {
			username: {
				required: "Unesite vase korisnicko ime.",
				rangelength: "Unesite izmedju 4 i 16 karaktera."
			}
		}
		});
	$("#updating").validate({
		rules: {
			ime: {
				required: true,
				lettersonly: true,
				rangelength:[3,16]
			},
			prezime: {
				required: true,
				lettersonly: true,
				rangelength:[4,16]
			},
			telefon: {
				required: true,
				digits: true,
				rangelength:[9,16]
			},
			adresa: {
				required: true,
				rangelength:[5,16]
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
				rangelength:[5,6]
			},
			password: {
				required: true,
				rangelength:[8,16]
			}
		},
		errorPlacement: function(error, element) { 
		       if ( element.is(":radio") || element.is(":checkbox")) {
		          error.appendTo( element.parent()); 
		        } else {
		          error.insertAfter(element);
		        } 
		    },
		messages: {
			ime: {
				required: "Unesite vase ime.",
				lettersonly: "Unesite samo slova.",
				rangelength: "Unesite izmedju 3 i 16 karaktera."
			},
			prezime: {
				required: "Unesite vase ime.",
				lettersonly: "Unesite samo slova.",
				rangelength: "Unesite izmedju 4 i 16 karaktera."
			},
			telefon: {
				digits: "Unesite samo brojeve.",
				required: "Unesite vas broj telefona.",
				rangelength: "Unesite izmedju 9 i 16 karaktera."
			},
			adresa: {
				required: "Unesite vasu adresu.",
				rangelength: "Unesite izmedju 5 i 16 karaktera."
			},
			email: {
				required: "Unesite vasu email adresu.",
				email: "Unesite validnu email adresu."
			},
			rodjenje: {
				required: "Unesite vas datum rodjenja."
			},
			pol: {
				required: "Unesite vas pol.",
				lettersonly: "Unesite samo slova.",
				rangelength: "Unesite izmedju 5 i 6 karaktera."
			},
			password: {
				required: "Unesite vasu lozinku.",
				rangelength: "Unesite izmedju 8 i 16 karaktera."
			}
		}
	});
});