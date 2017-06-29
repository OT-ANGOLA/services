package org.sola.cs.services.ejbs.claim.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.sola.services.common.repository.Localized;
import org.sola.services.common.repository.entities.AbstractVersionedEntity;

@Table(schema = "opentenure", name = "workflow_action")
public class WorkflowAction extends AbstractVersionedEntity {
    public static final String ACTION_CODE_PRINT = "print";
    public static final String ACTION_CODE_APPROVE = "approve";
    public static final String ACTION_CODE_ISSUE = "issue";
    
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "step_id")
    private String stepId;
    @Column(name = "report_name")
    private String reportName;
    @Column(name = "button_label")
    @Localized
    private String buttonLabel;
    @Column(name = "action_code")
    private String actionCode;
    
    public WorkflowAction(){
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

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getButtonLabel() {
        return buttonLabel;
    }

    public void setButtonLabel(String buttonLabel) {
        this.buttonLabel = buttonLabel;
    }

    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }
}
