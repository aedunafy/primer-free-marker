<#import "/spring.ftl" as spring/>
<#import "ui/ui.ftl" as ui/>


<html>
<head>
	<title> Component </title>
</head>
<body>

	<@ui.composition>
		
		<form action="test" method="post">
		
			<@spring.bind "person"/>
			
			<@ui.select "person.age.age"/>		
			<br>
			
			<br>		
			<@ui.text "person.name"/>			
				
			
			<br>
			<br>
			
			<@ui.submit/>
			
		</form>	
	</@ui.composition>
	
</body>
</html>