<%-- <%@page import="com.liferay.assignment.office.service.EmployeeLocalServiceUtil"%>
<%@include file="init.jsp"%>

<%
    String keywords = ParamUtil.getString(request, "keywords");
%>

<liferay-portlet:renderURL varImpl="searchURL">
        <portlet:param name="mvcPath" value="/view_search.jsp" />
</liferay-portlet:renderURL>

<liferay-portlet:renderURL varImpl="iteratorURL">
			<portlet:param name="mvcPath" value="/searchContainer.jsp"/>	
	</liferay-portlet:renderURL>

<aui:form action="<%= searchURL %>" method="get" name="fm">
    <liferay-portlet:renderURLParams varImpl="searchURL" />

    <liferay-ui:header
        backURL="<%= iteratorURL.toString() %>"
        title="search"
    />
    
    <div class="search-form">
        <span class="aui-search-bar">
            <aui:input inlineField="<%= true %>" label="" name="keywords" size="30" title="search-entries" type="text" />
        
            <aui:button type="submit" value="search" />
        </span>
    </div>
</aui:form> --%>

<%-- <%
        SearchContext searchContext = SearchContextFactory.getInstance(request);

        searchContext.setKeywords(keywords);
        searchContext.setAttribute("paginationType", "more");
        searchContext.setStart(0);
        searchContext.setEnd(10);
        
        Indexer indexer = IndexerRegistryUtil.getIndexer(Employee.class);

        Hits hits = indexer.search(searchContext);
        
        List<Employee> entries = new ArrayList<Employee>();

        for (int i = 0; i < hits.getDocs().length; i++) {
                Document doc = hits.doc(i);

                long entryId = GetterUtil
                .getLong(doc.get(Field.ENTRY_CLASS_PK));

                Employee entry = null;
                
                try {
                	entry = EmployeeLocalServiceUtil.getEmployee(entryId);
                        //entry = EntryLocalServiceUtil.getEntry();
                } catch (PortalException pe) {
                        _log.error(pe.getLocalizedMessage());
                } catch (SystemException se) {
                        _log.error(se.getLocalizedMessage());
                }
                
                entries.add(entry);
        }

        List<Employee> guestbooks = EmployeeLocalServiceUtil.getEmployee(entryId);
        		
        
        Map<String, String> guestbookMap = new HashMap<String, String>();
        
        for (Employee guestbook : guestbooks) {
                guestbookMap.put(Long.toString(guestbook.getEmployeeId()), guestbook.getName());
        }
%>

<liferay-ui:search-container delta="10" emptyResultsMessage="no-entries-were-found">
        <liferay-ui:search-container-results
                results="<%= entries %>"
                total="<%= entries.size() %>"
        />

        <liferay-ui:search-container-row
                className="com.liferay.assignment.office.model.Employee"
                keyProperty="entryId" modelVar="entry" escapedModel="<%=true%>">
                <liferay-ui:search-container-column-text name="guestbook"
                        value="<%=guestbookMap.get(Long.toString(entry.getEmployeeId()))%>" />

                <liferay-ui:search-container-column-text property="message" />

                <liferay-ui:search-container-column-text property="name" />
                
                <liferay-ui:search-container-column-jsp
            path="entry_actions.jsp"
            align="right" />
        </liferay-ui:search-container-row>

        <liferay-ui:search-iterator />
</liferay-ui:search-container>

<%
        if (Validator.isNotNull(keywords)) {
                String currentURL = PortalUtil.getCurrentURL(request);
                PortalUtil.addPortletBreadcrumbEntry(request, LanguageUtil.get(
                                pageContext, "search") + ": " + keywords, currentURL);
        }
%>

<%!
        private static Log _log = LogFactoryUtil.getLog("view_search_jsp");
%> --%>