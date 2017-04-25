// FUNCTIE WORDT UITGEVOERD BIJ KLIKKEN OP "WACHTWOORD WIJZIGEN"
function changePwd() {

	// MAAK POST REQUEST
	$.post('/resetpwd.php', {
		'platform': $('#platform').val(),
		'username': $('#username').val(),
		'accounttype': $('#accounttype').val(),
		'password': $('#password').val()
	}, function (data) {
		alert(data);
		$('#username').val('');
		$('#password').val('');
		$('#accounttype').val('0');
	}).fail(function (data) {
		alert(data.responseText);
	});
};

// EIGEN ALERT FUNCTIE --> VIA JQUERY DIALOG --> BEETJE MOOIER QUA INTERFACE
function alert(text, func) {
	if (!document.getElementById('alertMsgDiv')) $(document.body).append('<div id="alertMsgDiv"></div>');
	$('#alertMsgDiv').html(text);

	var buttons = {};
	buttons['Ok'] = function () {
		$(this).dialog('destroy').empty()
		if (func !== undefined) {
			func();
		}
	};

	$('#alertMsgDiv').dialog({
		bgiframe: true,
		modal: true,
		title: 'Melding',
		width: 300,
		resizable: false,
		buttons: buttons
	});
	$('#alertMsgDiv').dialog('open');
	$('.ui-dialog-titlebar-close').hide();
};

