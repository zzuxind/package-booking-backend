package tws.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tws.entity.Packages;

import java.util.List;

@Mapper
public interface PackageMapper {
    void addPackage(@Param("package") Packages packages);

    List<Packages> getPackageList();
}
