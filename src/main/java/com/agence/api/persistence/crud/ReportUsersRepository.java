package com.agence.api.persistence.crud;

import com.agence.api.persistence.entity.ReportUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReportUsersRepository extends CrudRepository<ReportUser, Integer> {

    @Query(nativeQuery = true, value = "" +
            "SELECT @rownum\\:=@rownum+1 AS id, name, user, period, cost_fixed, net_earnings, commission, profit " +
            "  FROM (SELECT @rownum\\:=0) r, ReportUsers u" +
            " WHERE user = :coUsuario")
    List<ReportUser> getRevenueByUser(@Param("coUsuario")  String coUsuario);

}
