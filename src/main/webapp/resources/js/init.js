$(document).ready(function() {
	new gnMenu(document.getElementById('gn-menu'));
	$('#supported').text('Supported/allowed: ' + !!screenfull.enabled);

	if (!screenfull.enabled) {
		return false;
	}

	$('#toggle').click(function() {
		screenfull.toggle($('#container')[0]);
	});
});
