$(window).bind("load", function() {
    // Loader
    $('.loader-background').addClass('visuallyhidden');
    setTimeout(function () {
        $('.loader-background').addClass('hidden');
    }, 700);
    $('.wrapper').removeClass('hidden');
    setTimeout(function () {
        $('.wrapper').removeClass('visuallyhidden');
    }, 200);

    // Hamburger, overlay, fixed logo toggles
    var trigger = $('.hamburger'),
        overlay = $('.overlay'),
        hamblogo = $('.hamb-logo'),
        isClosed = false;
  
      trigger.click(function () {
        hamburger_cross();      
      });
  
      function hamburger_cross() {
  
        if (isClosed == true) {
            trigger.removeClass('is-open');
            trigger.addClass('is-closed');
            isClosed = false;
            hamblogo.removeClass('hidden');
            setTimeout(function () {
                hamblogo.removeClass('visuallyhidden');
            }, 20);
            overlay.addClass('visuallyhidden');
            overlay.one('transitionend', function(e) {
                overlay.addClass('hidden');
            });
            
        } else {
            trigger.removeClass('is-closed');
            trigger.addClass('is-open');
            isClosed = true;
            hamblogo.addClass('visuallyhidden');
            hamblogo.one('transitionend', function(e) {
                hamblogo.addClass('hidden');
            });
            overlay.removeClass('hidden');
            setTimeout(function () {
                overlay.removeClass('visuallyhidden');
            }, 20);
        }
    }
    
    $('[data-toggle="offcanvas"]').click(function () {
          $('.wrapper').toggleClass('toggled');
    });

    // Footer reveal
    $('footer').footerReveal({ shadow: false, zIndex: -1 });

    // Check active page
    var path = window.location.pathname.split('/')[1];
    var target = $('nav a[href="/'+path+'"]');
    target.addClass('active');

    // Plugin @RokoCB : Return the visible amount of px of any element currently in viewport.
    (function($, win) {
        $.fn.inViewport = function(cb) {
            return this.each(function(i,el){
                function visPx(){
                var H = $(this).height(),
                    r = el.getBoundingClientRect(), t=r.top, b=r.bottom;
                return cb.call(el, Math.max(0, t>0? H-t : (b<H?b:H)));  
            } visPx();
            $(win).on('resize scroll', visPx);
        });
    };
    }(jQuery, window));
    
    $('.progress-bar-percent').inViewport(function(px){
        if(px) $(this).addClass('triggered') ;
    });

    // Header change color on dark, red sections
    var sections = document.querySelectorAll('.section-dark,.section-red');
    var initialTopOffset = 20;
    $(window).scroll(function(event) {
        $('.hamb-logo').css('color', '#1a1a1a');
        $('.hamb-top').css('background-color', '#1a1a1a');
        $('.hamb-middle').css('background-color', '#1a1a1a');
        $('.hamb-bottom').css('background-color', '#1a1a1a');
        var scroll = $(window).scrollTop();
        for (var i = 0; i < sections.length; i++) {
            var section = $(sections[i]);
            if (scroll + initialTopOffset >= section.offset().top && scroll + initialTopOffset <= section.offset().top + section.outerHeight()) {
                $('.hamb-logo').css('color', '#f5f5f5');
                $('.hamb-top').css('background-color', '#f5f5f5');
                $('.hamb-middle').css('background-color', '#f5f5f5');
                $('.hamb-bottom').css('background-color', '#f5f5f5');
            }
        }
    });
    
    //trigger the scroll
    $(window).scroll();

    // split
    var headline = $('.split-text'),
        words = headline.text().split(""),
        html = "";

    setTimeout(function () {
        $('.split-text').removeClass('hidden');
        for (var i = 0; i < words.length; i++) {
            html += "<span>" + words[i] + "</span>";
            headline.html(html).children().hide().each(function(i) {
                return $(this).delay(i*100).fadeIn(500);
            });
        }
    }, 800);
});