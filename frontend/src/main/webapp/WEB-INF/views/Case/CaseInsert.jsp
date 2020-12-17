<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<div class="container case-wrapper-scroll-y case-custom-scrollbar">
	<legend>${prop} Case Detail</legend>
	<sf:form modelAttribute="case">
	
	<br>
	<br>
	<sf:select class="form-control" id="Cid" path="Cid" style="width: 150px"
						items="${ClientName}"
						itemLabel="Cname"
						itmeValue="Cid"
							/>
							</sf:form>
</div>
