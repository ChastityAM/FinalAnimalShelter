<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

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
            background-Image: url() background-repeat: no-repeat;
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
</body>
<header class="font size: 12vw">
    <h1 class="container-fluid">
        <p class="text-center">Profile</p>
    </h1>
    <div class="dropdown">
        <button type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown">
            Animal Type
        </button>
        <div class="dropdown-menu modal-trigger">
            <a class="Dog dropdown-item">Dog</a>
            <a class="Cat dropdown-item">Cat</a>
            <a class="Bird dropdown-item">Bird</a>
            <a class="Bird dropdown-item">Snake</a>
        </div>
    </div>

    <div class="dropdown">
        <button type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown">
            Specific Animal
        </button>
        <div class="dropdown-menu modal-trigger">
            <a class="Dog1 dropdown-item">Dog1</a>
            <a class="Dog2 dropdown-item">Dog2</a>
            <a class="Cat1 dropdown-item">Cat1</a>
            <a class="Cat2 dropdown-item">Cat2</a>
            <a class="Bird1 dropdown-item">Bird1</a>
            <a class="Bird2 dropdown-item">Bird2</a>
            <a class="Snake1 dropdown-item">Snake1</a>
            <a class="Snake2 dropdown-item">Snake2</a>


        </div>
    </div>

    <div class="container-lg">
        <div class="content">
            <div class="body">
                <div class="form-group">
                    <label for="name">First and Last Name:</label><br>
                    <label for="Phone Number">Phone Number:</label><br>
                    <label for="Email">Email:</label><br>
                    <label for="password">Password:</label><br>
                </div>
                <form action="#">
                    <div class="form-group">
                        <label for="name">Credit Card Number:</label>
                        <input type="number" class="form-control" placeholder="Enter Credit Card Phone Number"
                            id="number">
                    </div>

                    <div class="form-group">
                        <label for="date">Expiration Date:</label>
                        <input type="date" class="form-control" placeholder="Enter Exp Date" id="date">
                    </div>

                    <div class="form-group">
                        <label for="code">Security Code:</label>
                        <input type="Phone Number" class="form-control" placeholder="Enter Code" id="code"> </div>
                    <button type="Exit" class="btn btn-primary">Exit</button>
                </form>
            </div>
        </div>
    </div>
    </main>

    <div class="row container-fluid">
        <div class="col-sm"></div>
        <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#adoptModal"
            data-modal-id="adoptModal">
            <div class="col center"></div>
            Adopt
        </button>
        <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#addModal"
            data-modal-id="addModal">
            <div class="col center"></div>
            Add Animal
        </button>
    </div>

    <!-- 1st Modal- Adopt Animal -->
    <div class="modal fade" id="adoptModal">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">

                <!-- Modal Header -->
                <header class="modal-header">
                    <h4 class="modal-title">Adopt</h4>
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

    <!-- 2nd Modal- Add Animal -->
    <div class="modal fade" id="addModal">
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