<!DOCTYPE html>
<html lang="de">
<head>
<meta charset="utf-8">
<title>form_radio_mathias</title>
</head>
<body>
<?php
$rziel = $_POST["rziel"];
$htyp = $_POST["htyp"];
echo "Nach $rziel in ein $htyp-Sterne-Hotel<br>";
switch($rziel)
{
	case "Vogesen":
	$angebote= $htyp == 4 ? 8 : 2;
	break;
	case "Kreta":
	$angebote= $htyp == 4 ? 14 : 6;
	break;
	case "Hawaii":
	$angebote= $htyp == 4 ? 6 : 7;
}
echo "Dazu haben wir $angebote Angebote";
?>
</body>
</html>