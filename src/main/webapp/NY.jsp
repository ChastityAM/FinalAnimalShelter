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
        <p class="text-center">New York
        </p>
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
        <img src="https://www.amny.com/wp-content/uploads/2019/10/AP_19301018509873-1024x889.jpg" alt="Animal Rescue"
            height="350" width="auto" class="mx-auto d-block rounded">
    </div>
    <aside>
        <title> Animals</title>
        <h2 id="Dogs"><u>Dogs</u></h2>
        <div class="container">
            <div class="row">
                <div class="col text-center container-sm">
                    <img src="https://tse1.mm.bing.net/th?id=OIP.UBhxl3q--w2lxUjfHD_SmwHaEo&pid=Api&P=0&w=263&h=165"
                        alt="Dog 3" height="150" width="150" class="rounded-circle cover">
                    <br><b>Dog 3</b></br>
                    Date: <br>
                </div>
                <div class="col text-center container-sm">
                    <img src="http://dogsaholic.com/wp-content/uploads/2015/05/Boo-the-cutest-pomeranian-dog.jpg"
                        alt="Dog 4" height="150" width="150" class="rounded-circle cover">
                    <br><b>Dog 4</b></br>
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
                    <img src="http://2.bp.blogspot.com/--mqQKXiTD0E/UIURXCYUxUI/AAAAAAAAHuQ/8jMmIdkdLX8/s1600/cats_desktop_1920x1200_hd-wallpaper-817100.jpeg"
                        alt="Cat 3" height="150" width="150" class="rounded-circle cover">
                    <br><b>Cat 3</b></br>
                    Date: <br>
                </div>
                <div class="col text-center container-sm">
                    <img src="https://image.winudf.com/v2/image/Y29tLmFuZHJvbW8uZGV2NjYwNjE0LmFwcDczMTE1M19zY3JlZW5fN18xNTE3MDM4NDQ2XzAzNQ/screen-7.jpg?fakeurl=1&type=.jpg"
                        alt="Cat 4" height="150" width="150" class="rounded-circle cover">
                    <br><b>Cat 4</b></br>
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
                    <img src="https://s-media-cache-ak0.pinimg.com/736x/b4/50/f1/b450f1b0b2d1d44019124dd28ffe5775.jpg"
                        alt="Parrot 3" height="150" width="150" class="rounded-circle cover">
                    <br><b>Parrot 3</b></br>
                    Date: <br>
                </div>
                <div class="col text-center container-sm">
                    <img src="https://images.freeimages.com/images/large-previews/94c/cute-parrot-1349232.jpg"
                        alt="Parrot 4" height="150" width="150" class="rounded-circle cover">
                    <br><b>Parrot 4</b></br>
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
                    <img src="https://listabuzz.com/wp-content/uploads/2015/03/tiny-snakes.jpg" alt="Snake 3"
                        height="150" width="150" class="rounded-circle cover">
                    <br><b>Snake 3</b></br>
                    Date: <br>
                </div>
                <div class="col text-center container-sm">
                    <img src="http://tailandfur.com/wp-content/uploads/2016/02/30-Small-Snake-Pictures-in-Human-Hands-40.jpg"
                        alt="Snake 4" height="150" width="150" class="rounded-circle cover">
                    <br><b>Snake 4</b></br>
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
                    Contact Us: New York Branch<br>
                    (212) 788-4000<br>
                    326 E 110th St. New York, NY 10029<br>
                    info@HomeFreeNY.com<br>
                </div>
                <div class="col">Locations<br>
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
                    <img src="FinalAnimalShelter.src.main.webapp.maps.NYMap.jpg" alt="New York map" height="150"
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