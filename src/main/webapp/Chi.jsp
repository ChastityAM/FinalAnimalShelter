<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Lobster&display=swap" rel="stylesheet">
</head>

<body class="font size: 12vw" style="color: rgb(6, 5, 68);">
    <style>
        footer {
            background-color: rgb(247, 213, 22);
            color: rgb(6, 5, 68);
            padding: 20px;
        }

        header {
            background-color: rgb(247, 213, 22);
            color: rgb(6, 5, 68);
            padding: 20px;
        }

        p,
        h2 {
            font-family: Lobster;
            color: rgb(6, 5, 68);
        }

        nav.sticky {
            position: -webkit-sticky;
            position: sticky;
            top: 0;
            padding: 5px;
        }

        button,
        .btn {
            background-color: rgb(6, 5, 68);
            color: rgb(247, 213, 22);
        }

        .right {
            float: right;
        }

        .cover {
            object-fit: cover;
        }

        aside {
            padding: 20px;
        }

        main {
            background-size: cover;
        }

        .modal-window {
            background-color: white;
            border-radius: 5px;
            box-shadow: 0 3px 7px rgba(0, 0, 0, 0.3);
            padding: 20px;
            transform: scale(0);
            transition: 0.2s ease-in-out all;
            position: absolute;
            margin: 1em;
        }

        .modal-window.visible {
            transform: scale(1);
            position: relative;
        }
    </style>
    <div class="row container-fluid">
        <div class="dropdown">
            <button type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown">
                Our Locations
            </button>
            <div class="dropdown-menu modal-trigger">
                <a class="LA dropdown-item" href="LA.jsp">Los Angeles</a>
                <a class="NY dropdown-item" href="NY.jsp">New York</a>
                <a class="Chi dropdown-item" href="Chi.jsp">Chicago</a>
            </div>
        </div>
        <div class="col-sm"></div>
        <div class="col-sm"></div>
        <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#registerModal"
            data-modal-id="registerModal">
            <div class="col center"></div>
            Register
        </button>
        <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#loginModal"
            data-modal-id="loginModal">
            <div class="col center"></div>
            Log In
        </button>
    </div>
</body>
<header class="font size: 12vw">
    <h1 class="container-fluid">
        <p class="text-center">Home Free Animal Rescue
            <br>
            Chicago
        </p>
    </h1>
</header>

<main class="font size: 12vw">
    <nav style="z-index: 1;" class="navbar navbar-expand-md bg-dark navbar-dark justify-content-center sticky">
        <div>
            <ul class="navbar-nav">
                <li class="nav-item"></li>
                <a class="nav-link" href="#Dogs">Dogs</a>
                <a class="nav-link" href="#Cats">Cats</a>
                <a class="nav-link" href="#Birds">Birds</a>
                <a class="nav-link" href="#Snakes">Snakes</a>
            </ul>
        </div>
    </nav>
    <div>
        <img src="http://resnapshot.vht.com/wp-content/uploads/2013/11/paws-chicago-adoption-center-lobby11.jpg"
            alt="Animal Rescue" height="350" width="auto" class="mx-auto d-block rounded">
    </div>
    <aside>
        <title> Animals</title>
        <h2 id="Dogs"><u>Dogs</u></h2>
        <div class="container">
            <div class="row">
                <div class="col text-center container-sm">
                    <img src="https://dogsaholic.com/wp-content/uploads/2018/03/Beagle-Harrier-lying-in-grass-680x486.jpg"
                        alt="Dog 5" height="150" width="150" class="rounded-circle cover">
                    <br><b>Dog 5</b></br>
                    Date: <br>
                </div>
                <div class="col text-center container-sm">
                    <img src="http://1.bp.blogspot.com/-fGPjMm8WagY/T6TJE00mrcI/AAAAAAAAEfs/Ee-bbjwd8YI/s1600/Cute-Puppy-puppies-wallpapers-06.jpg"
                        alt="Dog 6" width="150" height="150" class="rounded-circle cover">
                    <br><b>Dog 6</b></br>
                    Date: <br>
                </div>
                <br>
                <div class="row container">
                    <div class="col-sm">
                        <div class="row">
                            <p>
                                <button type="button" class="btn btn-secondary">
                                    <div class="col center"></div>
                                    More Inventory
                                </button>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <br>
        <h2 id="Cats"><u>Cats</u></h2>
        <div class="container">
            <div class="row">
                <div class="col text-center container-sm">
                    <img src="https://1.bp.blogspot.com/-48udOdlnPuM/T9xVm2S3DyI/AAAAAAAAAHc/Ds_XFBWqRio/s1600/SY7CKKR4DJDX.jpg"
                        alt="Cat 5" height="150" width="150" class="rounded-circle cover">
                    <br><b>Cat 5</b></br>
                    Date: <br>
                </div>
                <div class="col text-center container-sm">
                    <img src="http://wallpapers9.org/wp-content/uploads/2017/05/Cute-Cat-2.jpg" alt="Cat 6" height="150"
                        width="150" class="rounded-circle cover">
                    <br><b>Cat 6</b></br>
                    Date: <br>
                </div>
                <div class="row container">
                    <div class="col-sm">
                        <div class="row">
                            <p>
                                <button type="button" class="btn btn-secondary">
                                    <div class="col center"></div>
                                    More Inventory
                                </button>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <br>
        <h2 id="Birds"><u>Birds</u></h2>
        <div class="container">
            <div class="row">
                <div class="col text-center container-sm">
                    <img src="https://i.pinimg.com/originals/de/5f/cd/de5fcd012bfd55db59d576d3d2ff71c6.jpg"
                        alt="Parrot 5" height="150" width="150" class="rounded-circle cover">
                    <br><b>Parrot 5</b></br>
                    Date: <br>
                </div>
                <div class="col text-center container-sm">
                    <img src="http://media-cache-ec0.pinimg.com/236x/1f/77/24/1f772444f60f630be806ecd5b9fff339.jpg"
                        alt="Parrot 6" height="150" width="150" class="rounded-circle cover">
                    <br><b>Parrot 6</b></br>
                    Date: <br>
                </div>
                <div class="row container">
                    <div class="col-sm">
                        <div class="row">
                            <p>
                                <button type="button" class="btn btn-secondary">
                                    <div class="col center"></div>
                                    More Inventory
                                </button>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <br>
        <h2 id="Snakes"><u>Snakes</u></h2>
        <div class="container">
            <div class="row">
                <div class="col text-center container-sm">
                    <img src="https://i.pinimg.com/originals/e2/dd/1f/e2dd1fa8319ce9a31febd29d4ae8b6f9.jpg"
                        alt="Snake 5" height="150" width="150" class="rounded-circle cover">
                    <br><b>Snake 5</b></br>
                    Date: <br>
                </div>
                <div class="col text-center container-sm">
                    <img src="https://68.media.tumblr.com/f299c1e0b26079101a35a0336310b691/tumblr_org6i00hC21vx2cajo1_500.jpg"
                        alt="Snake 6" height="150" width="150" class="rounded-circle cover">
                    <br><b>Snake 6</b></br>
                    Date: <br>
                </div>
                <div class="row container">
                    <div class="col-sm">
                        <div class="row">
                            <p>
                                <button type="button" class="btn btn-secondary">
                                    <div class="col center"></div>
                                    More Inventory
                                </button>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <br>
    </aside>

    <footer class="container-fluid"><b>
            <div class="row">
                <div class="col">
                    Contact Us: Chicago Branch<br>
                    (773) 935-7297<br>
                    1997 N Clybourn Ave. Chicago, IL 60614<br>
                    info@HomeFreeChicago.com<br>
                </div>
                <div class="col">
                    Locations<br>
                    Franchise<br>
                    Solutions<br>
                    Events<br>
                </div>
                <div class="col">Join Our Team<br>
                    Volunteer<br>
                    Press<br>
                    Donate<br>
                </div>
                <div>
                    <img src="FinalAnimalShelter.src.main.webapp.maps.ChicagoMap.jpg" alt="Chicago map" height="150"
                        width="auto" class="mx-auto d-block rounded">
                </div>
            </div>
    </footer>

    <div class="modal fade" id="registerModal">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">

                <!-- Modal Header -->
                <header class="modal-header">
                    <h4 class="modal-title">Register</h4>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                </header>

                <div class="modal-body">
                    <form action="#">
                        <div class="form-group">
                            <label for="name">First and Last Name:</label>
                            <input type="name" class="form-control" placeholder="Enter First and Last Name" id="name">
                        </div>

                        <div class="form-group">
                            <label for="Phone Number">Phone Number:</label>
                            <input type="Phone Number" class="form-control" placeholder="Enter Phone Number"
                                id="Phone Number">
                        </div>

                        <div class="form-group">
                            <label for="Email">Email:</label>
                            <input type="Email" class="form-control" placeholder="Enter Email" id="Email">
                        </div>

                        <div class="form-group">
                            <label for="password">Password:</label>
                            <input type="password" class="form-control" placeholder="Enter Password" id="password">
                        </div>
                        <button type="Submit" class="btn btn-primary">Submit</button>
                    </form>
                </div>
                <!-- Modal footer -->
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>

    <div class="modal fade" id="loginModal">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">

                <!-- Modal Header -->
                <header class="modal-header">
                    <h4 class="modal-title">Log In</h4>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                </header>

                <div class="modal-body">
                    <form action="#">
                        <div class="form-group">
                            <label for="Email">Email:</label>
                            <input type="Email" class="form-control" placeholder="Enter Email" id="Email">
                        </div>

                        <div class="form-group">
                            <label for="password">Password:</label>
                            <input type="password" class="form-control" placeholder="Enter Password" id="password">
                        </div>

                        <div class="form-group form-check">
                            <label class="form-check-label">
                                <input class="form-check-input" type="checkbox"> Remember me
                            </label>
                        </div>

                        <button type="Submit" class="btn">Submit</button>
                    </form>
                </div>

                <!-- Modal footer -->
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>
</main>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
    integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous">
    </script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
    integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous">
    </script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
    integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous">
    </script>
</body>

</html>