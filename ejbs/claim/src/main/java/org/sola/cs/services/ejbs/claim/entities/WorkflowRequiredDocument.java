package org.sola.cs.services.ejbs.claim.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.sola.services.common.repository.entities.AbstractVersionedEntity;

@Table(schema = "opentenure", name = "workflow_req_doc")
public class WorkflowRequiredDocument extends AbstractVersionedEntity {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "step_id")
    private String stepId;
    @Column(name = "doc_type")
    private String docTypeCode;
    
    public WorkflowRequiredDocument(){
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStepId() {
        return stepId;
    }

    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    public String getDocTypeCode() {
        return docTypeCode;
    }

    public void setDocTypeCode(String docTypeCode) {
        this.docTypeCode = docTypeCode;
    }
}
