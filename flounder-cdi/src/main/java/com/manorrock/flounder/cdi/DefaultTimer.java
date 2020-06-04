/*
 *  Copyright (c) 2002-2020, Manorrock.com. All Rights Reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 *      1. Redistributions of source code must retain the above copyright
 *         notice, this list of conditions and the following disclaimer.
 *
 *      2. Redistributions in binary form must reproduce the above copyright
 *         notice, this list of conditions and the following disclaimer in the
 *         documentation and/or other materials provided with the distribution.
 *
 *      3. Neither the name of the copyright holder nor the names of its 
 *         contributors may be used to endorse or promote products derived from
 *         this software without specific prior written permission.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 *  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 *  IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 *  ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 *  LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 *  SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 *  INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 *  CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 *  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 *  POSSIBILITY OF SUCH DAMAGE.
 */
package com.manorrock.flounder.cdi;

import java.io.Serializable;
import java.util.Date;
import javax.ejb.EJBException;
import javax.ejb.NoMoreTimeoutsException;
import javax.ejb.NoSuchObjectLocalException;
import javax.ejb.ScheduleExpression;
import javax.ejb.Timer;
import javax.ejb.TimerHandle;

/**
 * The default Timer.
 * 
 * @author Manfred Riem (mriem@manorrock.com)
 */
public class DefaultTimer implements Timer {

    public DefaultTimer(Date initialExpiration, long intervalDuration, Serializable info) {
    }

    public DefaultTimer(Date expiration, Serializable info) {
    }

    @Override
    public void cancel() throws IllegalStateException, NoSuchObjectLocalException, EJBException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public long getTimeRemaining() throws IllegalStateException, NoSuchObjectLocalException, NoMoreTimeoutsException, EJBException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Date getNextTimeout() throws IllegalStateException, NoSuchObjectLocalException, NoMoreTimeoutsException, EJBException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ScheduleExpression getSchedule() throws IllegalStateException, NoSuchObjectLocalException, EJBException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isPersistent() throws IllegalStateException, NoSuchObjectLocalException, EJBException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isCalendarTimer() throws IllegalStateException, NoSuchObjectLocalException, EJBException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Serializable getInfo() throws IllegalStateException, NoSuchObjectLocalException, EJBException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public TimerHandle getHandle() throws IllegalStateException, NoSuchObjectLocalException, EJBException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
