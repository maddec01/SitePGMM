<!DOCTYPE html>
<html>
<?php define( 'ABS_PATH', dirname(dirname(__FILE__)) . '/' ); ?>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>PG Multimedia</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="apple-touch-icon" sizes="76x76" href="/assets/favico/apple-touch-icon.png">
    <link rel="icon" type="image/png" sizes="32x32" href="/assets/favico/favicon-32x32.png">
    <link rel="icon" type="image/png" sizes="16x16" href="/assets/favico/favicon-16x16.png">
    <link rel="manifest" href="/assets/favico/site.webmanifest">
    <link rel="mask-icon" href="/assets/favico/safari-pinned-tab.svg" color="#5bbad5">
    <meta name="msapplication-TileColor" content="#da532c">
    <meta name="theme-color" content="#ffffff">

    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.13/css/all.css" integrity="sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" media="screen" href="/css/main.css" />
    <link rel="stylesheet" type="text/css" media="screen" href="/css/normalize.css" />

    <!-- Page Specific CSS -->
    <link rel="stylesheet" type="text/css" media="screen" href="/css/portfolio.css" />

    <script src="/js/jquery.min.js"></script>
    <script src="/js/footer-reveal.js"></script>
    <script src="/js/main.js"></script>
</head>

<body>
    <div class="loader-background">
        <div class="loader"></div>
    </div>
    <div class="wrapper hidden visuallyhidden">
        <!-- Sidebar -->
        <?php include(ABS_PATH . "/includes/nav.php"); ?>
        <?php include(ABS_PATH . "/includes/fixedlogo.php"); ?>
        <!-- Page Content -->
        <div id="page-content-wrapper">
            <div class="overlay hidden visuallyhidden"></div>
            <section class="section-light" style="min-height: 100vh;">
                <div class="row nested top-nav" >
                    <a class="fil-cat active" data-rel="all">All</a>
                    <a class="fil-cat" data-rel="web">Video</a>
                    <a class="fil-cat" data-rel="flyers">Design</a>
                    <a class="fil-cat" data-rel="bcards">Development</a>
                    <a class="fil-cat" data-rel="bcards">Broadcast</a>
                    <a class="fil-cat" data-rel="bcards">Web</a>
                    <a class="fil-cat" data-rel="bcards">Concept</a>
                </div>
                <div id="portfolio">
                    <!-- Emli store -->
                    <div class="tile scale-anm web all">
                        <img src="/portfolio/d-emlistore/cover.png" alt="" />
                        <a href="#">
                            <div class="portfolio-hover">
                                <div class="portfolio-hover-text">
                                    <h2>Emli Store</h2>
                                    <p>Design</p>
                                </div>
                            </div>
                        </a>
                    </div>
                    <!-- Estudio 21 GO -->
                    <div class="tile scale-anm web all">
                        <img src="/portfolio/d-estudio21gopening/cover.png" alt="" />
                        <a href="#">
                            <div class="portfolio-hover">
                                <div class="portfolio-hover-text">
                                    <h2>Estudio 21</h2>
                                    <p>Design</p>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="tile scale-anm web all">
                        <img src="http://demo.themerain.com/charm/wp-content/uploads/2015/04/emi_haze-300x201.jpg" alt="" />
                    </div>
                    <div class="tile scale-anm web all">
                        <img src="http://demo.themerain.com/charm/wp-content/uploads/2015/04/codystretch-300x270.jpg" alt="" />
                    </div>
                    <div class="tile scale-anm flyers all">
                        <img src="https://placeholdit.imgix.net/~text?txtsize=33&txt=350%C3%97190&w=350&h=190" alt="" />
                    </div>
                    <div class="tile scale-anm bcards all">
                        <img src="https://placeholdit.imgix.net/~text?txtsize=19&txt=200%C3%97290&w=200&h=290" alt="" />
                    </div>
                    <div class="tile scale-anm flyers all">
                        <img src="http://demo.themerain.com/charm/wp-content/uploads/2015/04/jti-icons_08-300x172.jpg" alt="" />
                    </div>
                    <div class="tile scale-anm flyers all">
                        <img src="http://demo.themerain.com/charm/wp-content/uploads/2015/04/transmission_01-300x300.jpg" alt="" />
                    </div>
                    <div class="tile scale-anm web all">
                        <img src="https://placeholdit.imgix.net/~text?txtsize=19&txt=200%C3%97290&w=200&h=290" alt="" />
                    </div>
                    <div class="tile scale-anm flyers all">
                            <img src="https://placeholdit.imgix.net/~text?txtsize=19&txt=200%C3%97290&w=200&h=290" alt="" /> 
                    </div>
                    <div class="tile scale-anm web all">
                        <img src="http://demo.themerain.com/charm/wp-content/uploads/2015/04/the-ninetys-brand_02-300x300.jpg" alt="" />
                    </div>
                    <div class="tile scale-anm bcards all">
                        <img src="http://demo.themerain.com/charm/wp-content/uploads/2015/04/15-dia_1092-1-300x300.jpg" alt="" />
                    </div>
                    <div class="tile scale-anm web all">
                        <img src="https://placeholdit.imgix.net/~text?txtsize=33&txt=350%C3%97190&w=350&h=190" alt="" /> 
                    </div>
                    <div class="tile scale-anm bcards all">
                        <img src="http://demo.themerain.com/charm/wp-content/uploads/2015/04/emi_haze-300x201.jpg" alt="" />  
                    </div>
                    <div class="tile scale-anm web all">
                        <img src="http://demo.themerain.com/charm/wp-content/uploads/2015/04/transmission_01-300x300.jpg" alt="" />
                    </div> 
                    <div class="tile scale-anm web all">
                        <img src="https://placeholdit.imgix.net/~text?txtsize=33&txt=350%C3%97190&w=350&h=190" alt="" />  
                    </div> 
                    <div class="tile scale-anm bcards all">     
                        <img src="https://placeholdit.imgix.net/~text?txtsize=19&txt=200%C3%97290&w=200&h=290" alt="" />
                    </div>
                </div>
            </section>
            <?php include(ABS_PATH . "/includes/footer.php"); ?>
        </div> 
    </div>
    <script>
       $(function() {
            var selectedClass = '';
            $('.fil-cat').click(function(){
                selectedClass = $(this).attr("data-rel");
                $('.fil-cat').removeClass('active');
                $(this).addClass('active');
                $('#portfolio').fadeTo(100, 0.1);
                $('#portfolio .tile').not('.'+selectedClass).fadeOut().removeClass('scale-anm');
                setTimeout(function() {
                $('.'+selectedClass).fadeIn().addClass('scale-anm');
                    $('#portfolio').fadeTo(300, 1);
                }, 300);
            });
        });
    </script>
</body>
</html>