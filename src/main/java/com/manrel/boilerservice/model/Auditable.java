package com.manrel.boilerservice.model;

import com.manrel.boilerservice.entity.Audit;

public interface Auditable {

    Audit getAudit();

    void setAudit(Audit audit);
}
