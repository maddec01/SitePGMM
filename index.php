<!DOCTYPE html>
<html>
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

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="js/footer-reveal.js"></script>
    <script src="js/main.js"></script>
</head>

<body>
    <div id="wrapper">
        <!-- Sidebar -->
        <?php include(ABS_PATH . "/includes/nav.php"); ?>
        <?php include(ABS_PATH . "/includes/fixedlogo.php"); ?>
        <!-- Page Content -->
        <div id="page-content-wrapper">
            <div class="overlay hidden"></div>
            <section class="section-light">
                <div class="mainhero">
                    &nbsp;
                </div>
            </section>
            <?php include(ABS_PATH . "/includes/footer.php"); ?>
        </div> 
    </div>
</body>
</html>