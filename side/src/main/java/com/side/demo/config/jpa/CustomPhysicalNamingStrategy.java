package com.side.demo.config.jpa;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategy;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

public class CustomPhysicalNamingStrategy implements PhysicalNamingStrategy {

	@Override
	public Identifier toPhysicalCatalogName(final Identifier logicalName, JdbcEnvironment jdbcEnvironment) {
		// TODO Auto-generated method stub
		return convertToSnakeCase(logicalName);
	}

	@Override
	public Identifier toPhysicalSchemaName(final Identifier logicalName, JdbcEnvironment jdbcEnvironment) {
		// TODO Auto-generated method stub
		return convertToSnakeCase(logicalName);
	}

	@Override
	public Identifier toPhysicalTableName(final Identifier logicalName, JdbcEnvironment jdbcEnvironment) {
		// TODO Auto-generated method stub
		return convertToSnakeCase(logicalName);
	}

	@Override
	public Identifier toPhysicalSequenceName(final Identifier logicalName, JdbcEnvironment jdbcEnvironment) {
		// TODO Auto-generated method stub
		return convertToSnakeCase(logicalName);
	}

	@Override
	public Identifier toPhysicalColumnName(final Identifier logicalName, JdbcEnvironment jdbcEnvironment) {
		// TODO Auto-generated method stub
		return convertToSnakeCase(logicalName);
	}

	private Identifier convertToSnakeCase(final Identifier identifier) {
		if (identifier == null) {
			return Identifier.toIdentifier("");
		}

		final String regex = "([a-z])([A-Z])";
		final String replacement = "$1_$2";
		final String newName = identifier.getText().replaceAll(regex, replacement)
				.toLowerCase();
				//.toUpperCase();
		return Identifier.toIdentifier(newName);
	}

}
