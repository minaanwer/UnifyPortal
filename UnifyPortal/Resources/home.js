$(document).on('ready', function () {
  $.HSCore.components.HSGoTo.init('.js-go-to');
});

$(window).on('load', function () {
  console.log("initialization of header 1");
  
  $.HSCore.components.HSHeader.init($('#js-header'));
  $.HSCore.helpers.HSHamburgers.init('.hamburger');

  $('.js-mega-menu').HSMegaMenu({
    event: 'hover',
    pageContainer: $('.container'),
    breakpoint: 991
  });
});