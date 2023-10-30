<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Login</title>
</head>
<body>
    <div id="login">
        <form action="/admin/login" method="post">
            <label for="email">Email:</label> <input type="text" id="email"
                name="email"> <label for="password">Password:</label> <input
                type="password" id="password" name="password">
            <button type="submit">Login</button>
            <button type="reset">Cancel</button>
        </form>
    </div>
    <a href="/">Back</a>
</div>
</body>
</html>