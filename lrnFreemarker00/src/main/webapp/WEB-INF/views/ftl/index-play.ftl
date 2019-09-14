<html>
<head>
	<title> FreeMarker Spring MVC Hello World</title>
</head>
<body>
<@upper>
<div>[Free Marker !!! C O M P O N E N T S !!!]</div>

<fieldset>
  	<legend>Add Car</legend>
  <form name="car" action="add" method="post">
  	Make : <input type="text" name="make" />	<br/>
  	Model: <input type="text" name="model" />	<br/>
  	<input type="submit" value="   Save   " />
  </form>
</fieldset>



<#macro greet person>
  <font>Hello ${person} !</font>
</#macro>

<@selecter></@selector>

<@greet person=model["person"]/>


  bar
  <#-- All kind of FTL is allowed here -->
  <#list ["red", "green", "blue"] as color>
    ${color}
  </#list>
  baaz


<table >

    <tr>
      <th>Make</th>
      <th>Model</th>
    </tr>
    
    <#list model["carList"] as car>
      <tr>
        <td>${car.make}</td>
        <td>${car.model}</td>
      </tr>
    </#list>
    
  </table>

</@upper>
</body>
</html>