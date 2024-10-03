<!DOCTYPE html>
<html>
<head>
    <title>Registro de Mascotas</title>
</head>
<body>
<h1>Registrar nueva mascota</h1>
<form action="add-pet" method="POST">
    <label for="name">Nombre:</label>
    <input type="text" id="name" name="name" required><br><br>

    <label for="breed">Raza:</label>
    <input type="text" id="breed" name="breed" required><br><br>

    <label for="age">Edad:</label>
    <input type="number" id="age" name="age" required><br><br>

    <input type="submit" value="Registrar Mascota">
</form>
</body>
</html>
