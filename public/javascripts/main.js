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
	if( $(this).is("#anasayfa") ) {
		$(this).addClass("activeHeaderLink");
		$('#page').animate({
			"opacity":"0"
		});
		$("#bottomBlackBorder").animate({
			"opacity":"0"
		});
	}else {
	    $('.menuContent').addClass("hide");
		var pageId = "#"+$(this).attr('id')+"Page";
		$(pageId).removeClass("hide");

		$(this).addClass("activeHeaderLink");
		$('#page').animate({
			"opacity":"1"
		});   
		$("#bottomBlackBorder").animate({
			"opacity":"1"
		});
	}
	 
});

$('#projeNedir').on('click', function() {
    $('.menuContent').addClass("hide");
    $('#projePage').removeClass("hide");
    $('#linksContainer > DIV').removeClass("activeHeaderLink");
    $('#proje').addClass("activeHeaderLink");
});

});