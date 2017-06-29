package org.sola.cs.services.ejbs.claim.entities;

import java.util.List;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.sola.services.common.repository.ChildEntityList;
import org.sola.services.common.repository.DefaultSorter;
import org.sola.services.common.repository.entities.AbstractVersionedEntity;

@Table(schema = "opentenure", name = "workflow_step")
@DefaultSorter(sortString="num desc")
@Cacheable
public class WorkflowStep extends AbstractVersionedEntity {
    @Id
    @Column(name = "id")
    private String id;
    @Column
    private int num;
    @Column(name = "claim_status")
    private String claimStatusCode;
    @Column(name = "parcel_size")
    private int parcelSize;
    @Column(name = "bigger_than_size")
    private boolean biggerThanSize;
    @Column(name = "next_step_tip")
    private String nextStepTip;
    @Column(name = "require_all_docs")
    private boolean requireAllDocs;
    
    @ChildEntityList(parentIdField = "stepId", cascadeDelete = true)
    private List<WorkflowRequiredDocument> requiredDocumentTypes;
    @ChildEntityList(parentIdField = "stepId", cascadeDelete = true)
    private List<WorkflowAction> actions;
    
    public WorkflowStep(){
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getClaimStatusCode() {
        return claimStatusCode;
    }

    public void setClaimStatusCode(String claimStatusCode) {
        this.claimStatusCode = claimStatusCode;
    }

    public int getParcelSize() {
        return parcelSize;
    }

    public void setParcelSize(int parcelSize) {
        this.parcelSize = parcelSize;
    }

    public boolean isBiggerThanSize() {
        return biggerThanSize;
    }

    public void setBiggerThanSize(boolean biggerThanSize) {
        this.biggerThanSize = biggerThanSize;
    }

    public String getNextStepTip() {
        return nextStepTip;
    }

    public void setNextStepTip(String nextStepTip) {
        this.nextStepTip = nextStepTip;
    }

    public List<WorkflowRequiredDocument> getRequiredDocumentTypes() {
        return requiredDocumentTypes;
    }

    public void setRequiredDocumentTypes(List<WorkflowRequiredDocument> requiredDocumentTypes) {
        this.requiredDocumentTypes = requiredDocumentTypes;
    }

    public List<WorkflowAction> getActions() {
        return actions;
    }

    public void setActions(List<WorkflowAction> actions) {
        this.actions = actions;
    }

    public boolean isRequireAllDocs() {
        return requireAllDocs;
    }

    public void setRequireAllDocs(boolean requireAllDocs) {
        this.requireAllDocs = requireAllDocs;
    }
}
