<!DOCTYPE html>
<html lang="en-US">
<?php define("ABS_PATH", dirname(__FILE__)); ?>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>PG Multimedia</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="apple-touch-icon" sizes="76x76" href="assets/favico/apple-touch-icon.png">
    <link rel="icon" type="image/png" sizes="32x32" href="assets/favico/favicon-32x32.png">
    <link rel="icon" type="image/png" sizes="16x16" href="assets/favico/favicon-16x16.png">
    <link rel="manifest" href="assets/favico/site.webmanifest">
    <link rel="mask-icon" href="assets/favico/safari-pinned-tab.svg" color="#5bbad5">
    <meta name="msapplication-TileColor" content="#da532c">
    <meta name="theme-color" content="#ffffff">

    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.13/css/all.css" integrity="sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" media="screen" href="css/main.css" />
    <link rel="stylesheet" type="text/css" media="screen" href="css/normalize.css" />

    <!-- Page Specific CSS -->
    <link rel="stylesheet" type="text/css" media="screen" href="css/index.css" />

    <script src="js/jquery.min.js"></script>
    <script src="js/footer-reveal.js"></script>
    <script src="js/main.js"></script>
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
            <section class="section-light">
                <div class="mainhero">
                    <div class="row nested top-nav" >
                        <a href="/portfolio">Portfolio</a>
                        <a href="/resume">Resume</a>
                    </div>
                    <div style="position: absolute; bottom: 0; margin-left: 38px;">
                        <h1 class="split-text hidden" style="font-size: 50px; color: #fff; margin-bottom: 20px;">Pedro Gomes</h1>
                    </div>
                </div>
            </section>
            <?php include(ABS_PATH . "/includes/footer.php"); ?>
        </div>
    </div>
</body>
</html>