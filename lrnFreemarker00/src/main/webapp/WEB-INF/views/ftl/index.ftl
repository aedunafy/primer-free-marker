<#import "ui/ui.ftl" as ui/>

<html>
<head>
	<title> Component </title>
</head>
<body>

<@ui.form model="person" method="post" action="test">
	<@ui.select "person.age.age"/>		
	<@ui.submit/>
</@ui.form>
	
</body>
</html>