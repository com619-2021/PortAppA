/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 1985j
 */
package my.solent.smartport.model.dto;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import my.solent.smartport.model.dock.dto.Dock;
import my.solent.smartport.model.port.dto.Port;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ReplyMessage {

    private Integer code = null;

    private String debugMessage = null;

    private Long totalCount = null;

    private Integer offset = null;

    private Integer limit = null;

    @XmlElementWrapper(name = "stringlist")
    @XmlElement(name = "string")
    private List<String> stringList = null;

    @XmlElementWrapper(name = "portlist")
    @XmlElement(name = "port")
    private List<Port> portList = null;

    @XmlElementWrapper(name = "docklist")
    @XmlElement(name = "dock")
    private List<Dock> dockList = null;

//    @XmlElementWrapper(name = "resourceList")
//    @XmlElement(name = "resource")
//    private List<Resource> resourceList = null;

//    @XmlElementWrapper(name = "resourceCatalogList")
//    @XmlElement(name = "resourceCatalog")
//    private List<ResourceCatalog> resourceCatalogList = null;

//    @XmlElementWrapper(name = "orderChangeRequestList")
//    @XmlElement(name = "orderChangeRequest")
//    private List<OrderChangeRequest> orderChangeRequestList = null;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDebugMessage() {
        return debugMessage;
    }

    public void setDebugMessage(String debugMessage) {
        this.debugMessage = debugMessage;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public List<Port> getPortList() {
        return portList;
    }

    public void setPortList(List<Port> portList) {
        this.portList = portList;
    }

//    public List<User> getUserList() {
//        return userList;
//    }

//    public void setUserList(List<User> userList) {
//        this.userList = userList;
//    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

//    public List<Resource> getResourceList() {
//        return resourceList;
//    }
//
//    public void setResourceList(List<Resource> resourceList) {
//        this.resourceList = resourceList;
//    }
//
//    public List<ResourceCatalog> getResourceCatalogList() {
//        return resourceCatalogList;
//    }
//
//    public void setResourceCatalogList(List<ResourceCatalog> resourceCatalogList) {
//        this.resourceCatalogList = resourceCatalogList;
//    }
//
//    public List<OrderChangeRequest> getOrderChangeRequestList() {
//        return orderChangeRequestList;
//    }
//
//    public void setOrderChangeRequestList(List<OrderChangeRequest> orderChangeRequestList) {
//        this.orderChangeRequestList = orderChangeRequestList;
//    }
//
//    public List<Order> getOrderList() {
//        return orderList;
//    }
//
//    public void setOrderList(List<Order> orderList) {
//        this.orderList = orderList;
//    }
    
}
