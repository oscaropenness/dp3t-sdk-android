/*
 * Created by Ubique Innovation AG
 * https://www.ubique.ch
 * Copyright (c) 2020. All rights reserved.
 */
package org.dpppt.android.sdk;

import java.util.ArrayList;
import java.util.Collection;

public class TracingStatus {

	private int numberOfContacts;
	private boolean advertising;
	private boolean receiving;
	private boolean wasContactExposed;
	private long lastSyncDate;
	private boolean reportedAsExposed;
	private Collection<ErrorState> errors;

	public TracingStatus(int numberOfContacts, boolean advertising, boolean receiving, boolean wasContactExposed,
			long lastSyncDate,
			boolean reportedAsExposed, Collection<ErrorState> errors) {
		this.numberOfContacts = numberOfContacts;
		this.advertising = advertising;
		this.receiving = receiving;
		this.wasContactExposed = wasContactExposed;
		this.lastSyncDate = lastSyncDate;
		this.reportedAsExposed = reportedAsExposed;
		this.errors = errors;
	}

	public int getNumberOfContacts() {
		return numberOfContacts;
	}

	public boolean isAdvertising() {
		return advertising;
	}

	public boolean isReceiving() {
		return receiving;
	}

	public boolean wasContactExposed() {
		return wasContactExposed;
	}

	public long getLastSyncDate() {
		return lastSyncDate;
	}

	public boolean isReportedAsExposed() {
		return reportedAsExposed;
	}

	public Collection<ErrorState> getErrors() {
		return errors;
	}

	public enum ErrorState {
		NETWORK_ERROR_WHILE_SYNCING(R.string.dp3t_sdk_service_notification_error_network_sync),
		MISSING_LOCATION_PERMISSION(R.string.dp3t_sdk_service_notification_error_location_permission),
		BLE_DISABLED(R.string.dp3t_sdk_service_notification_error_bluetooth_disabled),
		BLE_NOT_SUPPORTED(R.string.dp3t_sdk_service_notification_error_bluetooth_not_supported),
		BLE_INTERNAL_ERROR(R.string.dp3t_sdk_service_notification_error_bluetooth_internal_error),
		BLE_ADVERTISING_ERROR(R.string.dp3t_sdk_service_notification_error_bluetooth_advertising_error),
		BLE_SCANNER_ERROR(R.string.dp3t_sdk_service_notification_error_bluetooth_scanner_error),
		BATTERY_OPTIMIZER_ENABLED(R.string.dp3t_sdk_service_notification_error_battery_optimization);

		private int errorString;

		ErrorState(int errorString) {
			this.errorString = errorString;
		}

		public int getErrorString() {
			return errorString;
		}
	}

}
