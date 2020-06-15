$(document).on('ready', function () {

  
  $.HSCore.components.HSGoTo.init('.js-go-to');
});

$(window).on('load', function () {

  
  $.HSCore.components.HSHeader.init($('#js-header'));
  $.HSCore.helpers.HSHamburgers.init('.hamburger');

  $('.js-mega-menu').HSMegaMenu({
    event: 'hover',
    pageContainer: $('.container'),
    breakpoint: 991
  });
  
});




$(window).on('change', function () {

  $.HSCore.components.HSGoTo.init('.js-go-to');
  
  $.HSCore.components.HSHeader.init($('#js-header'));
  $.HSCore.helpers.HSHamburgers.init('.hamburger');

  $('.js-mega-menu').HSMegaMenu({
    event: 'hover',
    pageContainer: $('.container'),
    breakpoint: 991
  });
  
});