/**
 * footer-reveal.js
 *
 * Licensed under the MIT license.
 * http://www.opensource.org/licenses/mit-license.php
 *
 * Copyright 2014 Iain Andrew
 * https://github.com/IainAndrew
 */

(function ($) {

  $.fn.footerReveal = function (options) {

      var $this = $(this),
          $prev = $this.prev(),
          $win = $(window),

          defaults = $.extend({
              shadow: true,
              shadowOpacity: 0.8,
              zIndex: -100
          }, options),

          settings = $.extend(true, {}, defaults, options);

      $win.on('load resize footerRevealResize', function () {
          if ($this.outerHeight() <= $win.outerHeight() && ($this.offset().top >= $win.outerHeight() || event.type != 'load')) {
              console.log(event.type);
              $this.css({
                  'z-index': defaults.zIndex,
                  position: 'fixed',
                  bottom: 0
              });

              if (defaults.shadow) {
                  $prev.css({
                      '-moz-box-shadow': '0 20px 30px -20px rgba(0,0,0,' + defaults.shadowOpacity + ')',
                      '-webkit-box-shadow': '0 20px 30px -20px rgba(0,0,0,' + defaults.shadowOpacity + ')',
                      'box-shadow': '0 20px 30px -20px rgba(0,0,0,' + defaults.shadowOpacity + ')'
                  });
              }


              $this.css({
                  'width': $prev.outerWidth()
              });
              $prev.css({
                  'margin-bottom': $this.outerHeight()
              });

          } else {
              $this.css({
                  width: 'initial',
                  position: 'initial'
              });

              $prev.css({
                  'margin-bottom': 'initial'
              });
          }
      });

      return this;

  };

})(jQuery);