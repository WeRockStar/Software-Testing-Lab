<!DOCTYPE html>
<html>
<head>
  <title>Triangle</title>
  <link href="demo.css" media="all" rel="stylesheet" type="text/css">
</head>
<body>
  <div id="container">
    <h1>Triangle Program</h1>
      <p>Please enter integers which are sides of a triangle and click submit.</p>
      <form name="triangle_form" action="checktriangle.php" method="POST">
        <table>
          <tr>
            <td><label for="side_A">Side A:</label></td>
            <td><input name="sideA"v id="sideA" size="30" type="text"></td>
          </tr>
          <tr>
            <td><label for="side_B">Side B:</label></td>
            <td><input name="sideB" id="sideB" size="30" type="text"></td>
          </tr>
		   <tr>
            <td><label for="side_C">Side C:</label></td>
            <td><input name="sideC" id="sideC" size="30" type="text"></td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td><input id="check_button" type="submit" value="Submit"></td>
          </tr>
        </table>
      </form>
  </div>
</body>
</html>
