<#include "select/select.ftl">
<#include "text/text.ftl">
<#include "button/submit.ftl">
<#import  "includes/js.ftl" as include/>

<#macro composition>
	<@include.vue/>	
	<div id="__app__">
		<#nested>		
	</div>
	<@include.app/>
</#macro>