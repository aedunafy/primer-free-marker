<#include "select/select.ftl">
<#include "text/text.ftl">
<#include "button/submit.ftl">

<#import  "includes/js.ftl" as include/>
<#import "/spring.ftl" as spring/>

<#macro form action model method>
	<@include.vue/>	
	<div id="__app__">
		<form action="${action}" method="${method}">
			<@spring.bind "${model}"/>
			<#nested>		
		</form>	
	</div>
	<@include.app/>
</#macro>


