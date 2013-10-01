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
		$(this).addClass("activeHeaderLink");
		$('#page').animate({
			"opacity":"1"
		});   
		$("#bottomBlackBorder").animate({
			"opacity":"1"
		});
	}
	 
});

});