<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Lisaa/ muuta/ poista ehdokkaita.</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="style.css" rel="stylesheet" type="text/css">
        
    </head>
    <body>
    <h2>Tasta paaset lisaamaan uuden ehdokkaan:</h2>
       <form action="/Muuta" method="get">
       Ehdokkaan etunimi:<br>
       <input type="text" name="etunimi"><br>
       Ehdokkaan sukunimi:<br>
       <input type="text" name="sukunimi"><br>
       Ehdokkaan puolue:<br>
       <input type="text" name="puolue"><br>
       Ehdokkaan kotipaikkakunta:<br>
       <input type="text" name="kotipaikkakunta"><br>
       Ehdokkaan ika:<br>
       <input type="text" name="ika"><br>
       Miksi eduskuntaan?:<br>
       <input type="text" name="miksiEduskuntaan"><br>
       Mita asioita haluaa edistaa?:<br>
       <input type="text" name="mitaEdistaa"><br>
       Ehdokkaan ammatti:<br>
       <input type="text" name="ammatti"><br>
       
       <input id="submitnappi" type="submit" value="Lisaa" name="btnLisaa" />
       </form> 
       
        
           
           
 
    </body>
</html>
