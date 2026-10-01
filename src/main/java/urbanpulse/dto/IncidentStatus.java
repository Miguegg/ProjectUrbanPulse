package urbanpulse.dto;

public enum IncidentStatus {
    REPORTED, VALIDATED, REJECTED, ASSIGNED, IN_PROGRESS, RESOLVED, REOPENED, CLOSED;

    // Transiciones permitidas entre estados
    public boolean canTransitionTo(IncidentStatus next) {
        return switch (this) {
            case REPORTED -> next == VALIDATED || next == REJECTED;
            case VALIDATED -> next == ASSIGNED;
            case ASSIGNED -> next == IN_PROGRESS;
            case IN_PROGRESS -> next == RESOLVED;
            case RESOLVED -> next == CLOSED || next == REOPENED;
            // El diagrama del PDF no indica cómo se sale de REOPENED: supuesto nuestro
            case REOPENED -> next == ASSIGNED || next == IN_PROGRESS;
            case REJECTED, CLOSED -> false;
        };
    }
}
