$(document).ready(function(){

$(".next-icon").mouseover(function(e) {
	e.preventDefault();
	$('#header').animate({
		"opacity":"1"
	});
});

// Next button click goes to next div
$('#linksContainer > DIV').on('click', function() {
	
	$('#linksContainer > DIV').removeClass("activeHeaderLink");
	$(this).addClass("activeHeaderLink");
	$('#page').animate({
		"opacity":"1"
	});    
});

});