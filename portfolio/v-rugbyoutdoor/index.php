<!DOCTYPE html>
<html lang="en-US">
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
    <link rel="stylesheet" type="text/css" media="screen" href="/css/portfolio_show.css" />

    <script src="/js/jquery.min.js"></script>
    <script src="/js/footer-reveal.js"></script>
    <script src="/js/main.js"></script>
    <script src="/js/sticky-sidebar.js"></script>
    
    <!-- Google Analytics -->
    <script async src="https://www.googletagmanager.com/gtag/js?id=UA-120910433-1"></script>
    <script>
        window.dataLayer = window.dataLayer || [];
        function gtag(){dataLayer.push(arguments);}
        gtag('js', new Date());
        gtag('config', 'UA-120910433-1');
    </script>
</head>

<body>
    <div class="loader-background">
        <div class="loader"></div>
    </div>
    <div class="wrapper hidden visuallyhidden">
        <!-- Sidebar -->
        <?php include(ABS_PATH . "../includes/nav.php"); ?>
        <?php include(ABS_PATH . "../includes/fixedlogo.php"); ?>
        <!-- Page Content -->
        <div id="page-content-wrapper">
            <div class="overlay hidden visuallyhidden"></div>
            <section class="section-light" style="min-height: 100vh;">
                <div class="container">
                    <div class="row nested">
                        <div class="col col-span-8 port-left">
                            <img src="/portfolio/v-rugbyoutdoor/pic01.jpg" alt="" />
                            <div class="video-container">
                                <iframe src="https://www.youtube.com/embed/p4G8B7oC6aU?rel=0&amp;showinfo=0" allowfullscreen="allowfullscreen" class="video"></iframe>
                            </div>
                            <div class="video-container">
                                <iframe src="https://www.youtube.com/embed/jAFQ3Zhm4qM?rel=0&amp;showinfo=0" allowfullscreen="allowfullscreen" class="video"></iframe>
                            </div>
                            <div class="port-gallery">
                            </div>
                        </div>
                        <div class="col col-span-4 port-right">
                            <h4>RUGBY OUTDOOR</h4>
                            <p style="margin: 0;">Outdoor Publicity</p>
                            <p style="margin: 45px 0px;">This is a promo video custom made for a outdoor mupi tto promote a Rugby Championship.</p>
                            <h3>Client</h3>
                            <p>Rugby Portugal, CMC</p>
                            <h3>Role</h3>
                            <p>Producer</p>
                            <h3>Year</h3>
                            <p>2017</p>
                            <h3>Website</h3>
                            <p><a href="http://www.fpr.pt" target="_blank">www.fpr.pt</a></p>
                        </div>
                    </div>
                </div>
            </section>
            <!-- back to portfolio -->
            <section class="section-red">
                <div class="container">
                    <div class="row nested section-padding" style="justify-content: center; text-align: center;">
                        <a href="/portfolio" class="button-large"><h3><i class="fas fa-th-large"></i>&nbsp;&nbsp;&nbsp;Back to portfolio</h3></a>
                    </div>
                </div>
            </section>
            <?php include(ABS_PATH . "../includes/footer.php"); ?>
        </div> 
    </div>
</body>
</html>