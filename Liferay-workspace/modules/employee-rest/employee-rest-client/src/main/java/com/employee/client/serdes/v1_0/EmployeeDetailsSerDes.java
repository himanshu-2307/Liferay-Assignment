package com.employee.client.serdes.v1_0;

import com.employee.client.dto.v1_0.EmployeeDetails;
import com.employee.client.json.BaseJSONParser;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

/**
 * @author Administrator
 * @generated
 */
@Generated("")
public class EmployeeDetailsSerDes {

	public static EmployeeDetails toDTO(String json) {
		EmployeeDetailsJSONParser employeeDetailsJSONParser =
			new EmployeeDetailsJSONParser();

		return employeeDetailsJSONParser.parseToDTO(json);
	}

	public static EmployeeDetails[] toDTOs(String json) {
		EmployeeDetailsJSONParser employeeDetailsJSONParser =
			new EmployeeDetailsJSONParser();

		return employeeDetailsJSONParser.parseToDTOs(json);
	}

	public static String toJSON(EmployeeDetails employeeDetails) {
		if (employeeDetails == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (employeeDetails.getDepartmentId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"departmentId\": ");

			sb.append(employeeDetails.getDepartmentId());
		}

		if (employeeDetails.getEmployeeId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"employeeId\": ");

			sb.append(employeeDetails.getEmployeeId());
		}

		if (employeeDetails.getJobTitle() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"jobTitle\": ");

			sb.append("\"");

			sb.append(_escape(employeeDetails.getJobTitle()));

			sb.append("\"");
		}

		if (employeeDetails.getName() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"name\": ");

			sb.append("\"");

			sb.append(_escape(employeeDetails.getName()));

			sb.append("\"");
		}

		if (employeeDetails.getSalary() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"salary\": ");

			sb.append(employeeDetails.getSalary());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		EmployeeDetailsJSONParser employeeDetailsJSONParser =
			new EmployeeDetailsJSONParser();

		return employeeDetailsJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(EmployeeDetails employeeDetails) {
		if (employeeDetails == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (employeeDetails.getDepartmentId() == null) {
			map.put("departmentId", null);
		}
		else {
			map.put(
				"departmentId",
				String.valueOf(employeeDetails.getDepartmentId()));
		}

		if (employeeDetails.getEmployeeId() == null) {
			map.put("employeeId", null);
		}
		else {
			map.put(
				"employeeId", String.valueOf(employeeDetails.getEmployeeId()));
		}

		if (employeeDetails.getJobTitle() == null) {
			map.put("jobTitle", null);
		}
		else {
			map.put("jobTitle", String.valueOf(employeeDetails.getJobTitle()));
		}

		if (employeeDetails.getName() == null) {
			map.put("name", null);
		}
		else {
			map.put("name", String.valueOf(employeeDetails.getName()));
		}

		if (employeeDetails.getSalary() == null) {
			map.put("salary", null);
		}
		else {
			map.put("salary", String.valueOf(employeeDetails.getSalary()));
		}

		return map;
	}

	public static class EmployeeDetailsJSONParser
		extends BaseJSONParser<EmployeeDetails> {

		@Override
		protected EmployeeDetails createDTO() {
			return new EmployeeDetails();
		}

		@Override
		protected EmployeeDetails[] createDTOArray(int size) {
			return new EmployeeDetails[size];
		}

		@Override
		protected void setField(
			EmployeeDetails employeeDetails, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "departmentId")) {
				if (jsonParserFieldValue != null) {
					employeeDetails.setDepartmentId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "employeeId")) {
				if (jsonParserFieldValue != null) {
					employeeDetails.setEmployeeId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "jobTitle")) {
				if (jsonParserFieldValue != null) {
					employeeDetails.setJobTitle((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "name")) {
				if (jsonParserFieldValue != null) {
					employeeDetails.setName((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "salary")) {
				if (jsonParserFieldValue != null) {
					employeeDetails.setSalary(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
		}

	}

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		for (String[] strings : BaseJSONParser.JSON_ESCAPE_STRINGS) {
			string = string.replace(strings[0], strings[1]);
		}

		return string;
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(entry.getKey());
			sb.append("\": ");

			Object value = entry.getValue();

			Class<?> valueClass = value.getClass();

			if (value instanceof Map) {
				sb.append(_toJSON((Map)value));
			}
			else if (valueClass.isArray()) {
				Object[] values = (Object[])value;

				sb.append("[");

				for (int i = 0; i < values.length; i++) {
					sb.append("\"");
					sb.append(_escape(values[i]));
					sb.append("\"");

					if ((i + 1) < values.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(entry.getValue()));
				sb.append("\"");
			}
			else {
				sb.append(String.valueOf(entry.getValue()));
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

}