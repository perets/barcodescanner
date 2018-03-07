package ru.korston;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class TicketDataStorage {

    private static final String SQL_GET_INFO =
            "SELECT srcaddr FROM agg WHERE id=7686";

    private JdbcTemplate jdbcTemplate;

    public TicketDataStorage (DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public String findSRCAddrFromAgg () {
        String srcAddr = jdbcTemplate.queryForObject(SQL_GET_INFO, new Object[]{}, String.class );
        return srcAddr;
    }
}
