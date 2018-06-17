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
                    <a class="fil-cat" data-rel="video">Video</a>
                    <a class="fil-cat" data-rel="design">Design</a>
                    <a class="fil-cat" data-rel="dev">Development</a>
                    <a class="fil-cat" data-rel="broad">Broadcast</a>
                    <a class="fil-cat" data-rel="web">Web</a>
                    <a class="fil-cat" data-rel="concept">Concept</a>
                </div>
                <div id="portfolio">
                    <!-- SWTL Game -->
                    <div class="tile scale-anm dev concept all">
                        <img src="/portfolio/dev-swtlgame/cover.jpg" alt="" />
                        <a href="/portfolio/dev-swtlgame">
                            <div class="portfolio-hover">
                                <div class="portfolio-hover-text">
                                    <h2>Stay With the Light</h2>
                                    <p>Game, Development, Concept</p>
                                </div>
                            </div>
                        </a>
                    </div>
                    <!-- Rugby AAC Outdoor -->
                    <div class="tile scale-anm video all">
                        <img src="/portfolio/v-rugbyoutdoor/cover.jpg" alt="" />
                        <a href="/portfolio/v-rugbyoutdoor">
                            <div class="portfolio-hover">
                                <div class="portfolio-hover-text">
                                    <h2>Rugby AAC Outdoor</h2>
                                    <p>Video</p>
                                </div>
                            </div>
                        </a>
                    </div>
                    <!-- Emli store -->
                    <div class="tile scale-anm design all">
                        <img src="/portfolio/d-emlistore/cover.png" alt="" />
                        <a href="/portfolio/d-emlistore">
                            <div class="portfolio-hover">
                                <div class="portfolio-hover-text">
                                    <h2>Emli Store</h2>
                                    <p>Design</p>
                                </div>
                            </div>
                        </a>
                    </div>
                    <!-- Estudio 21 GO -->
                    <div class="tile scale-anm design all">
                        <img src="/portfolio/d-estudio21gopening/cover.png" alt="" />
                        <a href="/portfolio/d-estudio21gopening">
                            <div class="portfolio-hover">
                                <div class="portfolio-hover-text">
                                    <h2>Estudio 21 Grand Opening</h2>
                                    <p>Design</p>
                                </div>
                            </div>
                        </a>
                    </div>
                    <!-- Estudio 21 Card -->
                    <div class="tile scale-anm design all">
                        <img src="/portfolio/d-estudio21card/cover.jpg" alt="" />
                        <a href="/portfolio/d-estudio21card">
                            <div class="portfolio-hover">
                                <div class="portfolio-hover-text">
                                    <h2>Estudio 21 Card</h2>
                                    <p>Design</p>
                                </div>
                            </div>
                        </a>
                    </div>
                    <!-- Custom Live Score -->
                    <div class="tile scale-anm dev broad all">
                        <img src="/portfolio/dev-customlivescore/cover.jpg" alt="" />
                        <a href="/portfolio/dev-customlivescore">
                            <div class="portfolio-hover">
                                <div class="portfolio-hover-text">
                                    <h2>Custom Live Score</h2>
                                    <p>Development</p>
                                </div>
                            </div>
                        </a>
                    </div>
                    <!-- Ideal Med Poster -->
                    <div class="tile scale-anm design all">
                        <img src="/portfolio/d-idealmed/cover.jpg" alt="" />
                        <a href="/portfolio/d-idealmed">
                            <div class="portfolio-hover">
                                <div class="portfolio-hover-text">
                                    <h2>IdealMed Rugby Tournament</h2>
                                    <p>Design</p>
                                </div>
                            </div>
                        </a>
                    </div>
                    <!-- Rugby AAC Posters -->
                    <div class="tile scale-anm design all">
                        <img src="/portfolio/d-rugbyaacposters/cover.jpg" alt="" />
                        <a href="/portfolio/d-rugbyaacposters">
                            <div class="portfolio-hover">
                                <div class="portfolio-hover-text">
                                    <h2>Rugby Posters</h2>
                                    <p>Design</p>
                                </div>
                            </div>
                        </a>
                    </div>
                    <!-- Exposer 2nd Anniversary -->
                    <div class="tile scale-anm video all">
                        <img src="/portfolio/v-exposer2anniversary/cover.jpg" alt="" />
                        <a href="/portfolio/v-exposer2anniversary">
                            <div class="portfolio-hover">
                                <div class="portfolio-hover-text">
                                    <h2>Exposer 2nd Anniversary</h2>
                                    <p>Video</p>
                                </div>
                            </div>
                        </a>
                    </div>
                    <!-- Exposer rugby -->
                    <div class="tile scale-anm video all">
                        <img src="/portfolio/v-exposerrugby/cover.jpg" alt="" />
                        <a href="/portfolio/v-exposerrugby">
                            <div class="portfolio-hover">
                                <div class="portfolio-hover-text">
                                    <h2>Exposer Rugby</h2>
                                    <p>Video</p>
                                </div>
                            </div>
                        </a>
                    </div>
                    <!-- Hacker -->
                    <div class="tile scale-anm video all">
                        <img src="/portfolio/v-hacker/cover.jpg" alt="" />
                        <a href="/portfolio/v-hacker">
                            <div class="portfolio-hover">
                                <div class="portfolio-hover-text">
                                    <h2>Hacker</h2>
                                    <p>Video</p>
                                </div>
                            </div>
                        </a>
                    </div>
                    <!-- Rugby AAC Videos -->
                    <div class="tile scale-anm video all">
                        <img src="/portfolio/v-rugbyaacvideos/cover.jpg" alt="" />
                        <a href="/portfolio/v-rugbyaacvideos">
                            <div class="portfolio-hover">
                                <div class="portfolio-hover-text">
                                    <h2>Rugby AAC Videos</h2>
                                    <p>Video</p>
                                </div>
                            </div>
                        </a>
                    </div>
                    <!-- Selfie -->
                    <div class="tile scale-anm video all">
                        <img src="/portfolio/v-selfie/cover.jpg" alt="" />
                        <a href="/portfolio/v-selfie">
                            <div class="portfolio-hover">
                                <div class="portfolio-hover-text">
                                    <h2>Selfie</h2>
                                    <p>Video</p>
                                </div>
                            </div>
                        </a>
                    </div>
                    <!-- Atlantic Pearl Madeira -->
                    <div class="tile scale-anm web all">
                        <img src="/portfolio/w-atpm/cover.jpg" alt="" />
                        <a href="/portfolio/w-atpm">
                            <div class="portfolio-hover">
                                <div class="portfolio-hover-text">
                                    <h2>Atlantic Pearl Madeira</h2>
                                    <p>Web</p>
                                </div>
                            </div>
                        </a>
                    </div>
                    <!-- Radio Som de Mais -->
                    <div class="tile scale-anm web dev all">
                        <img src="/portfolio/w-rsdm/cover.jpg" alt="" />
                        <a href="/portfolio/w-rsdm">
                            <div class="portfolio-hover">
                                <div class="portfolio-hover-text">
                                    <h2>Radio Som de Mais</h2>
                                    <p>Web, Development</p>
                                </div>
                            </div>
                        </a>
                    </div>
                </div>
            </section>
            <!-- Link Contact -->
            <section class="section-red">
                <div class="container">
                    <div class="row nested section-padding" style="justify-content: center; text-align: center;">
                        <a href="/contact" class="button-large"><h3><i class="fas fa-envelope"></i>&nbsp;&nbsp;&nbsp;Lets have a talk</h3></a>
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