<?php

require_once 'dpr.php';

// Fungsi untuk menampilkan anggota DPR
function displayDPR($dpr) {
    echo "<img src='" . $dpr->get_Photo() . "' style='width:200px'><br>";
    echo "ID: " . $dpr->get_Id() . "<br>";
    echo "Name: " . $dpr->get_Name() . "<br>";
    echo "Bidang: " . $dpr->get_namaBidang() . "<br>";
    echo "Partai: " . $dpr->get_Partai() . "<br>";
}

// Fungsi untuk menambahkan anggota DPR
function addDPR($id, $name, $namaBidang, $partai, $photo) {
    global $dprs;
    $newDPR = new DPR($id, $name, $namaBidang, $partai, $photo);
    $dprs[] = $newDPR;
}

// fungsi untuk menghapus anggota DPR
function deleteDPR($index) {
    global $dprs;
    unset($dprs[$index]);
    $dprs = array_values($dprs); // membaca ulang indeks setelah dihapus
}

// fungsi untuk edit anggota DPR -> ini error t__t
function editDPR($index, $name, $namaBidang, $partai, $photo) {
    global $dprs;
    $dprs[$index]->set_Id($id);
    $dprs[$index]->set_Name($name);
    $dprs[$index]->set_namaBidang($namaBidang);
    $dprs[$index]->set_Partai($partai);
    $dprs[$index]->set_Photo($photo);
}

// array untuk anggota dpr
$dprs = [];

// untuk cek jika form di submit adalah menambah, menghapus ataupun edit
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Add DPR
    if (isset($_POST['add'])) {
        addDPR($_POST['id'], $_POST['name'], $_POST['namaBidang'], $_POST['partai'], $_POST['photo']);
    }
    // Delete DPR
    elseif (isset($_POST['delete'])) {
        deleteDPR($_POST['id']);
    }
    // Edit DPR
    elseif (isset($_POST['edit'])) {
        editDPR($_POST['id'], $_POST['name'], $_POST['namaBidang'], $_POST['partai'], $_POST['photo']);
    }
}

// membuat anggota DPR
$dpr1 = new DPR(123, 'Hana', 'Finance', 'Demokrat', 'test1.jpeg');
$dpr2 = new DPR(456, 'Lusi', 'Education', 'PDIP', 'test2.jpeg');
$dprs[] = $dpr1;
$dprs[] = $dpr2;

// menampilkan anggota DPR
foreach ($dprs as $index => $dpr) {
    echo "DPR " . ($index + 1) . ":<br>";
    displayDPR($dpr);
    echo "<hr>";
}

?>

<!-- Form for adding a new DPR -->
<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
    <h2>Add DPR:</h2>
    <label>ID:</label>
    <input type="text" name="id" required><br>
    <label>Name:</label>
    <input type="text" name="name" required><br>
    <label>Bidang:</label>
    <input type="text" name="namaBidang" required><br>
    <label>Partai:</label>
    <input type="text" name="partai" required><br>
    <label>Photo:</label>
    <input type="file" name="photo" required><br>
    <input type="submit" name="add" value="Add">
</form>

<!-- Form for deleting a DPR -->
<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
    <h2>Delete DPR:</h2>
    <label>ID:</label>
    <input type="number" name="id" required><br>
    <input type="submit" name="delete" value="Delete">
</form>

<!-- Form for editing a DPR -->
<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
    <h2>Edit DPR:</h2>
    <label>ID:</label>
    <input type="number" name="id" required><br>
    <label>Name:</label>
    <input type="text" name="name" required><br>
    <label>Bidang:</label>
    <input type="text" name="namaBidang" required><br>
    <label>Partai:</label>
    <input type="text" name="partai" required><br>
    <label>Photo:</label>
    <input type="file" name="photo" required><br>
    <input type="submit" name="edit" value="Edit">
</form>
