package com.jayway.facebooktestjavaapi.testuser;

import java.util.List;

/**
 * Provides access to Facebook test users for an application.
 * <p/>
 */
public interface FacebookTestUserStore {
    /**
     * Creates a new Facebook test user for a Facebook application.
     * @param appInstalled True if the account should directly accept the application requesting the provided permissions, False otherwise.
     * @param permissions Comma-separated list of permissions for the Facebook application.
     * @return The created Facebook test users, if successful.
     */
    FacebookTestUserAccount createTestUser(boolean appInstalled, String permissions);

    /**
     * Queries Facebook about all registered test users for a Facebook application.
     * @return A list of Facebook test users.
     */
    List<FacebookTestUserAccount> getAllTestUsers();

    /**
     * Delete all test users registered for a Facebook application.
     */
    void deleteAllTestUsers();
}
