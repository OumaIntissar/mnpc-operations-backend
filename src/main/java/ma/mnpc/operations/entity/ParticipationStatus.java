package ma.mnpc.operations.entity;

public enum ParticipationStatus {
    REGISTRATION, QUALIFICATION_ROUND, ONLINE_PAYMENT, OFFICIAL_CONTECT, DISQUALIFIED, WAITING_LIST
    /***
     * REGISTRATION === Incompleted or doesn't meet the requirements === DISQUALIFIED
     *              === Completed and meet the requirements === QUALIFICATION_ROUND
     * QUALIFICATION_ROUND === Well ranked (Top X team, X = the available spots) === ONLINE_PAYMENT
     *                     === Ranked well in your institution === WAITING_LIST by institution - 3 teams max
     * ONLINE_PAYMENT === Payed before deadline + instituion spots full === OFFICIAL_CONTECT + WAITING_LIST of this school to DISQUALIFIED
     *                === No payment === DISQUALIFIED + Notifying teams from the WAITING_LIST
     */
}
