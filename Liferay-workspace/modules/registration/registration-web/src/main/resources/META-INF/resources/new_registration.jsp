<%@ include file="init.jsp"%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addEntry" var="addEntryURL"></portlet:actionURL>

<aui:form action="<%=addEntryURL%>" name="<portlet:namespace />fm">
	<aui:fieldset-group markupView="lexicon">
		<aui:fieldset label="Basic Info">
			<aui:row>
				<aui:col width="50">
					<aui:input label="First Name" name="first_name" type="text">
						<aui:validator errorMessage="Please enter the first name"
							name="required"></aui:validator>
						<aui:validator name="alphanum"></aui:validator>
						<aui:validator name="maxLength">50</aui:validator>
					</aui:input>
				</aui:col>
				<aui:col width="50">
					<aui:input label="Last Name" name="last_name" required="true"
						type="text">
						<aui:validator name="alphanum"></aui:validator>
						<aui:validator name="maxLength">50</aui:validator>
					</aui:input>
				</aui:col>
			</aui:row>
			<aui:row>
				<aui:col width="50">
					<aui:input label="Email Address" name="email_address"
						required="true" type="email">
						<%-- <aui:validator name="alphanum"></aui:validator> --%>
						<aui:validator name="maxLength">255</aui:validator>
						<aui:validator name="email"></aui:validator>
					</aui:input>
				</aui:col>
				<aui:col width="50">
					<aui:input label="Username" name="user_name" required="true"
						type="text">
						<aui:validator name="alphanum"></aui:validator>
						<aui:validator name="rangeLength">[4,16]</aui:validator>
					</aui:input>
				</aui:col>
			</aui:row>
			<aui:row>
				<aui:col width="50">
					<aui:select label="Gender" name="gender"
						required="true" prefix="Must choose one of the following">
						<aui:option value="Option1">Female</aui:option>
						<aui:option value="Option2">Male</aui:option>
				    </aui:select>
				</aui:col>
				<aui:col width="50">
					<aui:input label="Birthday" name="birthday"
						required="true" type="type" />
				</aui:col>
			</aui:row>
			<aui:row>
				<aui:col width="50">
					<aui:input label="Password" id="password" name="password1"
						required="true" type="password">
						<aui:validator
							errorMessage="Password Policy:- Minimum 6 characters, 
                      must contain one uppercase, one number, one special character."
							name="custom">
			                function(val, fieldNode, ruleValue) {
			                        var regex = new RegExp(/^(?=.*\d)(?=.*[!@#$%^&*])(?=.*[A-Z]).{6,}$/);
			                        return regex.test(val);
			                }
       				 </aui:validator>
					</aui:input>
				</aui:col>
				<aui:col width="50">
					<aui:input label="Confirm Password" id="password" name="password2"
						required="true" type="password">
						<aui:validator name="equalTo"
							errorMessage="The passwords much match. Please try again.">
            				'#<portlet:namespace />password'</aui:validator>
					</aui:input>
				</aui:col>
			</aui:row>
		</aui:fieldset>
	</aui:fieldset-group>

	<aui:fieldset-group markupView="lexicon">
		<aui:fieldset label="Phone">
			<aui:row>
				<aui:col width="50">
					<aui:input label="Home Phone" name="home_phone" type="text">
						<aui:validator name="number"></aui:validator>
						<aui:validator name="rangeLength"
							errorMessage="Please enter 10 digit Home Phone">[10,10]</aui:validator>
					</aui:input>
				</aui:col>
				<aui:col width="50">
					<aui:input label="Mobile Phone" name="mobile_phone" type="type">
						<aui:validator name="number"></aui:validator>
						<aui:validator name="rangeLength"
							errorMessage="Please enter 10 digit Mobile Phone">[10,10]</aui:validator>
					</aui:input>
				</aui:col>
			</aui:row>
		</aui:fieldset>
	</aui:fieldset-group>


	<aui:fieldset-group markupView="lexicon">
		<aui:fieldset label="Billing Address (US-Only)">
			<aui:row>
				<aui:col width="50">
					<aui:input label="Address 1" name="address" required="true"
						type="text">
						<aui:validator name="alphanum"></aui:validator>
						<aui:validator name="maxLength">255</aui:validator>
					</aui:input>
				</aui:col>
				<aui:col width="50">
					<aui:input label="Address 2" name="address2" type="text">
						<aui:validator name="alphanum"></aui:validator>
						<aui:validator name="maxLength">255</aui:validator>
					</aui:input>
				</aui:col>
			</aui:row>
			<aui:row>
				<aui:col width="50">
					<aui:input label="City" name="city" required="true" type="text">
						<aui:validator name="alphanum"></aui:validator>
						<aui:validator name="maxLength">255</aui:validator>
					</aui:input>
				</aui:col>
				<aui:col width="50">
					<aui:input label="State" name="state" required="true" type="text" />
					<!-- must use Liferay's State code -->
				</aui:col>
			</aui:row>
			<aui:row>
				<aui:col width="50">
					<aui:input label="Zip Code" name="zip" required="true" type="text">
						<aui:validator name="number"></aui:validator>
						<aui:validator name="rangeLength">[5,5]</aui:validator>
					</aui:input>
				</aui:col>
			</aui:row>
		</aui:fieldset>
	</aui:fieldset-group>

	<aui:fieldset-group markupView="lexicon">
		<aui:fieldset label="Miscellaneous">
			<aui:row>
				<aui:col width="50">
					<aui:select label="Security Question" name="security_question"
						required="true" prefix="Must choose one of the following">
						<aui:option value="Option 1">What is your mother's maiden name?</aui:option>
						<aui:option value="Option 2">What is the make of your first car?</aui:option>
						<aui:option value="Option 3">What is your high school mascot?</aui:option>
						<aui:option value="Option 4">Who is your favorite actor?</aui:option>
					</aui:select>

				</aui:col>
				<aui:col width="50">
					<aui:input label="Answer" required="true" name="security_answer"
						type="text">
						<aui:validator name="alphanum"></aui:validator>
						<aui:validator name="maxLength">255</aui:validator>
					</aui:input>
				</aui:col>
			</aui:row>
			
			<aui:input
				label="I have read, understand, and agree with the Terms of Use governing my access 
            to and use of the Acme Movie Fanatics 	web site."
				name="accepted_tou" type="checkbox" required="true" />

		</aui:fieldset>
	</aui:fieldset-group>

	<aui:button-row>
		<aui:button type="submit"></aui:button>
		<aui:button type="cancel" onClick="<%=viewURL.toString()%>"></aui:button>
	</aui:button-row>
</aui:form>